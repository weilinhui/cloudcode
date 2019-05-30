/**
 * Created by weilinhui on 2019/5/30.
 */
$(function() {

    $(".sub_button").click(function () {
        $.ajax({
            url: 'startLogin',
            type : "post",
            data : {"fUserPhone":$("input[name ='fUserPhone']").val(),"fUserPassword":$("input[name ='fUserPassword']").val()},
            success: function(result){
                if(result.status == 0){
                   window.location.href="index"
                }else{
                   $(".error_text").text("账户或密码不正确！");
                   $(".error_text").fadeIn();
                   $(".error_text").fadeOut(3000);
                }
            },
            error : function(e) {
                console.log("error.............");
            }
        });
    })

});