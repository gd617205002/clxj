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
            location.href="/Adminuser/findByIdAdminUser.do?id="+value;
        }
    }

    //生成用户数据
    $('#mytab').bootstrapTable({
        method: 'get',
        contentType: "application/x-www-form-urlencoded",
        url:"/Adminuser/findAllAdminUser.do",
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
                title:'用户名',
                field:'username',
            },
            {
                title:'密码',
                field:'pwd',
            },
            {
                title:'手机',
                field:'mobile',
            },
            {
                title:'真实姓名',
                field:'name'
            },
            {
                title:'用户类型',
                field:'usertype',
                formatter:userTypeFormate
            },
            {
                title:'账号有效性',
                field:'userflag',
                formatter:Formateflag
            },
            {
                title:'注册时间',
                field:'regtime',
                formatter:dateFormate
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

    //格式化管理员类型
    function userTypeFormate(value,row,index) {
        if (value==0){
            return "超级管理员";
        } else if(value==1){
            return "僧侣管理员";
        }else if(value==2){
            return "丛林管理员";
        }else if(value==3){
            return "闲居管理员";
        }else if(value==4){
            return "用车管理员";
        }
    }

    //格式化账号期限
    function Formateflag(value,row,index){
        if (value==1)
            return "永久";
        else
            return "短期";
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
            username:$('#search_username').val(),
        }
    }


    //查询按钮事件
    $('#search_btn').click(function(){

        $('#mytab').bootstrapTable('refresh', {url: '/Adminuser/findAllAdminUser.do'});
    })


    //增加按钮事件
    $('#btn_add').click(function(){
       location.href = "/back_admin_add.do";
    })


    //删除按钮与修改按钮的出现与消失
    $('.bootstrap-table').change(function(){
        var dataArr=$('#mytab .selected');
        if(dataArr.length==1){
            $('#btn_edit').css('display','block').removeClass('fadeOutRight').addClass('animated fadeInRight');
        }else{
            $('#btn_edit').addClass('fadeOutRight');
            setTimeout(function(){
                $('#btn_edit').css('display','none');
            },400);
        }
        if(dataArr.length>=1){
            $('#btn_delete').css('display','block').removeClass('fadeOutRight').addClass('animated fadeInRight');
        }else{
            $('#btn_delete').addClass('fadeOutRight');
            setTimeout(function(){
                $('#btn_delete').css('display','none');
            },400);
        }
    });

    //修改按钮事件
    $('#btn_edit').click(function() {
        var dataArr = $('#mytab').bootstrapTable('getSelections');

    });


    //删除事件按钮
    $('#btn_delete').click(function(){
        if (confirm("确定要删除用户吗")) {
            var dataArr=$('#mytab').bootstrapTable('getSelections');
            var ID=[];
            for(var i=0;i<dataArr.length;i++){
                ID[i]=dataArr[i].id;
            }
            $.ajax({
                url:"/Adminuser/deleteAdminUser/"+ID,
                dataType:"json",
                type:"post",
                ContentType:"application/json;charset=UTF-8",
                data:{_method:"delete"},
                success:function(data){
                    if(data){
                        layer.msg("删除成功");
                    }else
                        layer.msg("删除失败");
                    $('#mytab').bootstrapTable('refresh', {url: '/Adminuser/findAllAdminUser.do'});
                },
                error:function(){
                    layer.msg("删除出现异常");
                }
            });
        }
        $('#btn_delete').addClass('fadeOutRight');
        setTimeout(function(){
            $('#btn_delete').css('display','none');
        },400);

    })
})


function tableHeight() {
    return $(window).height() - 222;
}

//添加修改用户
function checkAdd() {
    var flag = true;//判断是否提交
    if ($("#username").val()==null||$("#username").val()==''){
        layer.msg("请输入用户名");
        flag = false;
    }
    if ($("#pwd").val()==null||$("#pwd").val()==''){
        layer.msg("请输入密码");
        flag = false;
    }
    if ($("#pwd").val()!=$("#pwd1").val()){
        layer.msg("您输入的两次密码不一致");
        flag = false;
    }
    if ($("#mobile").val()==null||$("#mobile").val()==''){
        layer.msg("请输入电话号码");
        flag = false;
    }

    if ($("#usertype").val()==null||$("#usertype").val()==''){
        layer.msg("请选择类型");
        flag = false;
    }
    if ($("#userflag").val()==null||$("#userflag").val()==''){
        layer.msg("请选择账号期限");
        flag = false;
    }
    if (flag) {
            //添加
            $.ajax({
                url:"/Adminuser/addAdminUser.do",
                type:"post",
                async:false,
                data:$("#form-user").serialize(),
                ContentType:"application/json;charset=UTF-8",
                dataType:"json",
                success:function (data) {
                    if (data)
                        layer.msg("添加成功");
                    else
                        layer.msg("添加失败");
                }
            })
        location.href="/back_admin.do";
    }
    return false;
}

function checkUpdate() {
    var flag = true;//判断是否提交
    if ($("#username").val()==null||$("#username").val()==''){
        layer.msg("请输入用户名");
        flag = false;
    }
    if ($("#pwd").val()==null||$("#pwd").val()==''){
        layer.msg("请输入密码");
        flag = false;
    }
    if ($("#pwd").val()!=$("#pwd1").val()){
        layer.msg("您输入的两次密码不一致");
        flag = false;
    }
    if ($("#mobile").val()==null||$("#mobile").val()==''){
        layer.msg("请输入电话号码");
        flag = false;
    }

    if ($("#usertype").val()==null||$("#usertype").val()==''){
        layer.msg("请选择类型");
        flag = false;
    }
    if ($("#userflag").val()==null||$("#userflag").val()==''){
        layer.msg("请选择账号期限");
        flag = false;
    }
    if (flag) {
            //修改
            $.ajax({
                url:"/Adminuser/updateAdminUser.do",
                async:false,
                type:"post",
                data:$("#form-user").serialize(),
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
    }
    location.href="/back_admin.do";
    return false;
}


