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
            location.href="/Carinfo/findByIdCarInfo.do?id="+value;
        }
    }

    //生成用户数据
    $('#mytab').bootstrapTable({
        method: 'get',
        contentType: "application/x-www-form-urlencoded",
        url:"/Carinfo/findAllCarInfo.do",
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
                title:'所属丛林闲居名称',
                field:'clxjmains.name',
            },
            {
                title:'标题',
                field:'cartitle',
            },
            {
                title:'价格',
                field:'price'
            },
            {
                title:'汽车牌照',
                field:'licence'
            },
            {
                title:'申请状态',
                field:'checkstatus',
                formatter:statusFormate
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




    //格式化审核状态
    function statusFormate(value,row,index){
        if (value==1)
            return "通过";
        else if (value==0)
            return "未审核";
        else
            return "未通过";
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
            cartitle:$('#search_cartitle').val(),
            checkstatus:$('#search_checkstatus').val(),
        }
    }


    //查询按钮事件
    $('#search_btn').click(function(){

        $('#mytab').bootstrapTable('refresh', {url: '/Carinfo/findAllCarInfo.do'});
    })
})


function tableHeight() {
    return $(window).height() - 222;
}

//更新丛林信息
function checkUpdate() {
            //修改
            $.ajax({
                url:"/Carinfo/updateCarInfo.do",
                async:false,
                type:"post",
                data:$("#form-car").serialize(),
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

    location.href="/back_ycshenhe.do";

    return false;
}



