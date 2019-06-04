/**
 * 这个支持异步
 * @param id 容器的id
 * @param elementName 行标签
 * @param dataEleName 列标签
 * @param fields 字段名字
 * @param sign 每一个数据的标记属性
 * @param socketUrl socket连接url
 * @constructor 构造一个即时更新链接对象
 */
function Immediately(rows, fields, pkIndex, rowNum, socketUrl) {

    // 属性赋值
    this.rows = rows;
    this.fields = fields;
    this.sign = "sign";
    this.templates = "";
    this.pkIndex = pkIndex;
    this.rowNum = rowNum;
    //  添加标识
    this.addSing = function () {
        // alert("添加标记");
        this.parent = $(this.rows).parent();
        //如果有参数则是异步
        if (typeof this.rowNum != "undefined") {
            //
            var inter = window.setInterval(code, 1000);
            var timeOut = 0;

            function code() {
                //
                timeOut++;
                if ($(window.immediately.rows).length >= window.immediately.rowNum || timeOut > 10) {
                    //  添加标识
                    var eles = $(window.immediately.rows);
                    //  遍历每一行
                    for (var i = 0; i < eles.length; i++) {
                        //  那一行
                        var rowTr = $(eles[i]);
                        rowTr.attr(window.immediately.sign, rowTr.children()[window.immediately.pkIndex].innerText);
                        var row = $(eles[i]).children();
                        for (var j = 0; j < row.length; j++) {
                            //一个单元格
                            $(row[j]).attr("fSign", window.immediately.fields[j]);
                        }
                        window.immediately.templates = rowTr.prop("outerHTML");
                    }
                    //关闭
                    window.clearInterval(inter);
                    timeOut = 0;
                }
            }
        } else {
            // 添加标识
            var eles = $("#" + window.immediately.rows);
            for (var i = 0; i < eles.length; i++) {
                var row = $(eles[i]).children();
                for (var j = 0; j < row.length; j++) {
                    $(row[j]).attr("fSign", window.immediately.fields[j]);
                }
                window.immediately.templates = row.prop("outerHTML");
            }
        }
    }

    // 做出改变
    this.change = function (inform) {
        //获取要修改的那一行父节点
        var ele = $(this.rows + "[" + this.sign + "=" + inform.sign + "]");
        var eleChildren = ele.children();
        var data = inform.data;
        //修改数据
        for (var fieldName in data) {
            // alert(fieldName);
            for (var i = 0; i < eleChildren.length; i++) {
                if ($(eleChildren[i]).attr("fSign") == fieldName) {
                    $(eleChildren[i]).text(data[fieldName]);
                }
            }
        }
    }
    //删除
    this.delete = function (inform) {
        var ele = $(this.rows + "[" + this.sign + "=" + inform.sign + "]");
        this.remove(ele);
    }
    // 此方法可重写来添加删除的特效
    this.remove = function (ele) {
        ele.remove();
    }

    this.add = function (inform) {
        //添加模板
        $(this.rows).parent().append(this.templates);
        //得到刚添加的模板
        var ele = $(this.rows + ":last");
        //添加行标识
        ele.attr(this.sign, inform.sign);
        //子元素
        var eleChildren = ele.children();
        //改变模板的内容
        for (var i = 0; i < eleChildren.length; i++) {
            var fSign = $(eleChildren[i]).attr("fSign");
            if (fSign != "" && fSign != null)
                $(eleChildren[i]).text(inform.data[fSign]);
        }
    }

    this.websocket = null;
    //判断当前浏览器是否支持WebSocket
    if ('WebSocket' in window) {
        this.websocket = new WebSocket(socketUrl);
    } else {
        alert('提示当前浏览器不支持WEBSOKET,将会失去信息即时更新的功能');
    }

    // 连接发生错误的回调方法
    this.websocket.onerror = function () {
        alert('提示：连接异常');
    };

    //连接成功建立的回调方法
    this.websocket.onopen = function () {
        alert("socket:连接成功：");
    }

    // 接收到消息的回调方法
    this.websocket.onmessage = function (message) {
        //
        var inform = eval("(" + message.data + ")");
        // alert("socket:接收到消息："+inform);
        //根据type判断是增加或删除或修改
        switch (inform.type) {
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
        window.immediately.closeWebSocket();
    }
}

$(function () {
    /**
     *  直接在body添加点击事件
     */
    $("body").click(function () {
        if (window.immediately.rowNum != null) {
            // alert("改变");
            window.immediately.addSing(true);
        }
    })
})
