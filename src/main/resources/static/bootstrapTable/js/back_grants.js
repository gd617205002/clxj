$(function(){
    //根据窗口调整表格高度
    $(window).resize(function() {
        $('#mytab').bootstrapTable('resetView', {
            height: tableHeight()
        })
    })
    
    //生成用户数据
    $('#mytab').bootstrapTable({
        method: 'get',
        contentType: "application/x-www-form-urlencoded",
        url:"/Grants/findAllGrants.do",
        height:tableHeight(),//高度调整
        toolbar: '#toolbar1',
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
                title:'捐款人名字',
                field:'donationname',
            },
            {
                title:'物品',
                field:'goods',
            },
            {
                title:'数量',
                field:'num',
            },
            {
                title:'价值(元)',
                field:'worthless',
            },
            {
                title:'使用去向',
                field:'useto',
            },
            {
                title:'受助人',
                field:'recipients',
            },
            {
                title:'捐赠时间',
                field:'donationTime',
                formatter:dateFormate
            }
        ],
        locale:'zh-CN',//中文支持,
    })

    //格式化日期
    function dateFormate(value,row,index){
       return new Date(value).Format("yyyy-MM-dd");
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
    $('#btn_delete').click(function(){
        var dataArr=$('#mytab').bootstrapTable('getSelections');
        var ID=[];
        for(var i=0;i<dataArr.length;i++){
            ID[i]=dataArr[i].id;
        }
        $.ajax({
            url:"/Grants/deleteGrants/"+ID,
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
            $('#btn_delete').addClass('fadeOutRight');
            setTimeout(function(){
                $('#btn_delete').css('display','none');
            },400);
        $('#mytab').bootstrapTable('refresh', {url: '/Grants/findAllGrants.do'});
    })

    $("#btn_add").click(function () {

        layer.open({
            title:"导入",
            type:2,
            content:"/back_uploadfile.do",
            area:['300px','150px'],
        })
    })

    //请求服务数据时所传参数
    function queryParams(params){
        return{
            pageSize: params.limit,
            pageIndex:params.pageNumber,
            donationname:$('#search_donationname').val(),
            recipients:$("#search_recipients").val()
        }
    }


    //查询按钮事件
    $('#search_btn').click(function(){

        $('#mytab').bootstrapTable('refresh', {url: '/Grants/findAllGrants.do'});
    })


});


function tableHeight() {
    return $(window).height() - 316;
}



