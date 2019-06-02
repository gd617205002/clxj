$(function(){
    //根据窗口调整表格高度
    $(window).resize(function() {
        $('#mytab').bootstrapTable('resetView', {
            height: tableHeight()
        })
    })
    //要在生成表格之前注册
    window.operateEvents={
        "click #tableView": function (e,value,row,index) {
            location.href="/Clxjmain/findByIdClxjMain.do?id="+value;
        }
    }

    //生成用户数据
    $('#mytab').bootstrapTable({
        method: 'get',
        contentType: "application/x-www-form-urlencoded",
        url:"/Clxjmain/findAllClxjMain.do",
        height:tableHeight(),//高度调整
        //toolbar: '#toolbar',
        striped: true, //是否显示行间隔色
        dataField: "rows",//key
        pageNumber: 1, //初始化加载第一页，默认第一页
        pagination:true,//是否分页
        queryParamsType:'limit',
        queryParams:queryParams,
        sidePagination:'server',
        pageSize:7,//单页记录数
        pageList:[7,10,20,30],//分页步进值
        showRefresh:true,//刷新按钮
        showColumns:true,
        //clickToSelect: true,//是否启用点击选中行
        toolbarAlign:'right',
        buttonsAlign:'right',//按钮对齐方式
        toolbar:'#toolbar',//指定工作栏
        columns:[
            {
                title:'全选',
                field:'select',
                checkbox:true,
                width:25,
                align:'center',
                valign:'middle'
            },
            {
                title:'ID',
                field:'id',
                visible:false
            },
            {
                title:'名称',
                field:'name',
            },
            {
                title:'地址类型',
                field:'type1',
                formatter:type1Formate
            },
            {
                title:'住址类型',
                field:'type2',
                formatter:type2Formate
            },
            {
                title:'地址',
                field:'belong_city'
            },
            {
                title:'价格',
                field:'price',
            },
            {
                title:'申请状态',
                field:'checkStatus',
                formatter:statusFormate
            },
            {
                title:'是否推荐',
                field:'recommend',
                formatter:recoFormate
            },
            {
                title: '操作',
                field:"id",
                width:80,
                events: operateEvents,
                formatter: operateFormatter
            }
        ],
        locale:'zh-CN',//中文支持,
    })

    //格式化日期
    function dateFormate(value,row,index){
       return new Date(value).Format("yyyy-MM-dd");
    }

    //格式化地址
    function type1Formate(value,row,index) {
        if (value==0)
            return "国外";
        else
            return "国内";
    }

    //格式化住址类型
    function type2Formate(value,row,index) {
         if (value==0)
             return "闲居";
        else
            return "丛林";
    }

    //格式化审核状态
    function statusFormate(value,row,index){
        if (value==1)
            return "通过";
        else if (value==0)
            return "未审核";
        else
            return "未通过";
    }

    function recoFormate(value,row,index){
        if (value==0)
            return "推荐";
        else
            return "不推荐";
    }

    //格式化日期
    Date.prototype.Format = function (fmt) { //author: meizz
        var o = {
            "M+": this.getMonth() + 1, //月份
            "d+": this.getDate(), //日
            "h+": this.getHours(), //小时
            "m+": this.getMinutes(), //分
            "s+": this.getSeconds(), //秒
            "q+": Math.floor((this.getMonth() + 3) / 3), //季度
            "S": this.getMilliseconds() //毫秒
        };
        if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
        for (var k in o)
            if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
        return fmt;
    }

    //按钮生成
    function operateFormatter(value,row,index){
            return ['<button id="tableView" type="button" class="btn btn-default"><span class="glyphicon glyphicon-pencil"></span></button>'].join('')
    }

    //请求服务数据时所传参数
    function queryParams(params){
        return{
            pageSize: params.limit,
            pageIndex:params.pageNumber,
            name:$('#search_name').val(),
            type1:$('#search_typeid').val(),
            checkStatus:$('#search_checkstatus').val(),
        }
    }


    //查询按钮事件
    $('#search_btn').click(function(){

        $('#mytab').bootstrapTable('refresh', {url: '/Clxjmain/findAllClxjMain.do'});
    })
})


function tableHeight() {
    return $(window).height() - 222;
}

//更新丛林信息
function checkUpdate() {
            //修改
            $.ajax({
                url:"/Clxjmain/updateClxjmain.do",
                async:false,
                type:"post",
                data:$("#form-clxj").serialize(),
                ContentType:"application/json;charset=UTF-8",
                dataType:"json",
                success:function (data) {
                    if (data)
                        layer.msg("修改成功");
                    else
                        layer.msg("修改失败");
                },
                error:function () {
                    alert("出异常了");
                }
            })

    location.href="/back_clshenhe.do";

    return false;
}


layui.use('laydate', function() {
    var laydate = layui.laydate;

    //日期时间选择器
    laydate.render({
        elem: '#kaifangshijian'
        ,type: 'datetime'
    });
});


