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
            location.href="/Helpinfo/findByIdHelpInfo.do?id="+value;
        }
    }

    //生成用户数据
    $('#mytab').bootstrapTable({
        method: 'get',
        contentType: "application/x-www-form-urlencoded",
        url:"/Helpinfo/findAllHelpInfo.do",
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
                title:'求助姓名',
                field:'name',
            },
            {
                title:'求助性别',
                field:'sex',
                formatter: sexFormatter
            },
            {
                title:'求助年龄',
                field:'age'
            },
            {
                title:'家庭年收入',
                field:'income'
            },
            {
                title:'享受低保',
                field:'basicliving',
                formatter:basicFormate
            },
            {
                title:'申请类型',
                field:'applytype',
                formatter: applytypeFormatter
            },
            {
                title:'申请状态',
                field:'applystatus',
                formatter: applystatusFormatter
            },
            {
                title:'申请金额',
                field:'applymoney'
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

    //性别格式化
    function sexFormatter(value,row,index) {
        if (value==1)
            return "男";
        else
            return "女";
    }

    //是否享受低保
    function basicFormate(value,row,index) {
        if (value==1)
            return "享受";
        else
            return "未享受";
    }


    //格式化审核状态
    function applystatusFormatter(value,row,index){
        if (value==0)
            return "审核中";
        else if (value==1)
            return "初审通过";
        else if (value==2)
            return "终审通过";
        else
            return "终审未通过"
    }

    //格式化申请类型
    function applytypeFormatter(value,row,index) {
        if (value==0)
            return "救助";
        else
            return "扶助";
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
            applystatus:$('#search_applystatus').val(),
        }
    }


    //查询按钮事件
    $('#search_btn').click(function(){

        $('#mytab').bootstrapTable('refresh', {url: '/Helpinfo/findAllHelpInfo.do'});
    })
})


function tableHeight() {
    return $(window).height() - 222;
}

//更新丛林信息
function checkUpdate() {
            //修改
            $.ajax({
                url:"/Helpinfo/updateHelpInfo.do",
                async:false,
                type:"post",
                data:$("#form-qiuzhu").serialize(),
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

    location.href="/back_qiuzhu.do";

    return false;
}



