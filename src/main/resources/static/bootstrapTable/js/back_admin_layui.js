$(function () {
    $("#adminuser").click(function () {
        layer.open({
            title:'用户详细信息',
            type:2,
            content:"/background/adminuser/back_admin_show.html",
            area:['500px','460px'],
            offset: 'auto'
        })
    });

    $("#update").click(function () {
        layer.open({
            title:'更改密码',
            type:2,
            content:"/background/adminuser/back_admin_updatepwd.html",
            area:['350px','270px'],
            offset: 'auto'
        })
    })
})