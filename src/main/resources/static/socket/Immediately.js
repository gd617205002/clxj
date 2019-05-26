/**
 * @param id 容器的id
 * @param elementName 行标签
 * @param dataEleName 列标签
 * @param fields 字段名字
 * @param sign 每一个数据的标记属性
 * @param socketUrl socket连接url
 * @constructor 构造一个即时更新链接对象
 */
function Immediately(id, elementName, dataEleName, fields, sign,socketUrl) {
    // 属性赋值
    this.id = id;
    this.elementName = elementName;
    this.dataEleName = dataEleName;
    this.fields = fields;
    this.sign = sign;
    // 添加标识
    var eles = $("#" + this.id + " " + elementName);
    for (var i = 0; i < eles.length; i++) {
        var row = $(eles[i]).children();
        for (var j = 0; j < row.length; j++) {
            $(row[j]).attr("fSign", this.fields[j]);
        }
    }
    // 做出改变
    this.change = function (inform) {
        //获取要修改的那一行父节点
        var ele = $("#" + this.id + " " + this.elementName + "[" + this.sign + "=" + inform.sign + "]");
        // alert(ele.length)
        //获取要修改的那一行
        var eleChildren = ele.children();
        var data = inform.data;
        //修改数据
        for (fieldName in data) {
            // alert(fieldName);
            // var fieldName = data[attr];
            for (var i = 0; i < eleChildren.length; i++) {
                if ($(eleChildren[i]).attr("fSign") == fieldName) {
                    $(eleChildren[i]).text(data[fieldName]);
                }
            }
        }
    }
    //删除
    this.delete = function (inform) {
        // alert("删除");
        var ele = $("#" + this.id + " " + this.elementName + "[" + this.sign + "=" + inform.sign + "]");
        this.remove(ele);
    }
    // 此方法可重写来添加删除的特效
    this.remove = function (ele) {
        ele.remove();
    }

    this.add = function (inform) {
        // alert("添加");
        // 添加节点
        var str = "<" + this.elementName + " " + this.sign + "='" + inform.sign + "'>";
        var data = inform.data;
        for (var i = 0; i < this.fields.length; i++) {
            var s = "<" + this.dataEleName + " fSign ='" + this.fields[i] + "'>";
            s = s + data[this.fields[i]];
            s = s + "</" + this.dataEleName + ">";
            str = str + s;
        }
        str = str + "/<" + this.elementName + ">";
        // alert(str);
        $("#" + this.id).append(str);
    }

    this.websocket = null;
    //判断当前浏览器是否支持WebSocket
    if ('WebSocket' in window) {
        this.websocket = new WebSocket(socketUrl);
    }else {
        alert('提示当前浏览器不支持WEBSOKET,将会失去信息即时更新的功能');
    }

    //连接发生错误的回调方法
    this.websocket.onerror = function () {
        // alert('提示：连接异常');
    };

    //连接成功建立的回调方法
    this.websocket.onopen = function () {
        // alert("socket:连接成功：");
    }

    //接收到消息的回调方法
    this.websocket.onmessage = function (message) {
        //
        var inform = eval("("+message.data+")");
        // alert("socket:接收到消息："+inform);
        //根据type判断是增加或删除或修改
        switch(inform.type){
            case "add":
                window.immediately.add(inform);
                break;
            case "del":
                window.immediately.delete(inform);
                break;
            case "chan":
                window.immediately.change(inform);
                break;
            default:
                //如果没找到此处可以反馈信息给后端
                break;
        }
    }

    //连接关闭的回调方法
    this.websocket.onclose = function () {
        // $.messager.alert('关闭连接，与服务器断开连接');
    }

    //关闭WebSocket连接
    this.closeWebSocket = function () {
        this.websocket.close();
    }

    //将自己绑定到window
    window.immediately = this;

    //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
    window.onbeforeunload = function () {
        window.immediately.websocket.closeWebSocket();
    }
}