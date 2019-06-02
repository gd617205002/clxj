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
            var  val = value;
            if (value==1){
                val = 0;
            } else
                val = 1;
            $.ajax({
                url:"/Reguser/updateRegUser.do",
                type:"post",
                ContentType:"application/json;charset=UTF-8",
                dataType:"json",
                data:{_method:"put",enableflag:val,id:row.id},
                success:function (data){
                    if(data){
                        layer.msg("修改成功");
                    }else
                        layer.msg("修改失败");
                    $('#mytab').bootstrapTable('refresh', {url: '/Reguser/findAllRegUser.do'});
                },
                error:function(){
                    layer.msg("出现异常了");
                }
            })
        }
    }

    //生成用户数据
    $('#mytab').bootstrapTable({
        method: 'get',
        contentType: "application/x-www-form-urlencoded",
        url:"/Reguser/findAllRegUser.do",
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
                title:'Email',
                field:'email'
            },
            {
                title:'真实姓名',
                field:'realname',
                sortable:true
            },
            {
                title:'性别',
                field:'sex',
                formatter:FormateSex
            },
            {
                title:'证件号码',
                field:'idcard',
                sortable:true
            },
            {
                title:'注册时间',
                field:'regtime',
                sortable:true,
                formatter:dateFormate
            },
            {
                title: '是否启用',
                field: 'enableflag',
                align: 'center',
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
    
    function FormateSex(value,row,index){
        if (value==1)
            return "男";
        else
            return "女";
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
        if(row.enableflag==1){
            return ['<button id="tableView" type="button" class="btn btn-danger">禁用</button>'].join('');
        }else if(row.enableflag==0){
            return ['<button id="tableView" type="button" class="btn btn-default">启用</button>'].join('');
        }else{
            return '数据错误';
        }
    }

    //请求服务数据时所传参数
    function queryParams(params){
        return{
            pageSize: params.limit,
            pageIndex:params.pageNumber,
            realname:$('#search_realname').val(),
        }
    }


    //查询按钮事件
    $('#search_btn').click(function(){

        $('#mytab').bootstrapTable('refresh', {url: '/Reguser/findAllRegUser.do'});
    })


    //增加按钮事件
    $('#btn_add').click(function(){

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
                url:"/Reguser/deleteRegUser/"+ID,
                dataType:"json",
                type:"post",
                ContentType:"application/json;charset=UTF-8",
                data:{_method:"delete"},
                success:function(data){
                    if(data){
                        layer.msg("删除成功");
                    }else
                        layer.msg("删除失败");
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
        $('#mytab').bootstrapTable('refresh', {url: '/Reguser/findAllRegUser.do'});
    })
})
function tableHeight() {
    return $(window).height() - 222;
}
