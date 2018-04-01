$(function () {
    //键盘敲击事件
    $("#phoneNumber").blur(function () {
        var value = $(this).val();
        check(value);
    });
});

function check(value) {
    var jqXHR = $.ajax({

            url: "/customer/checkUser.action",
            data: {"phoneNumber": value},
            method: "POST"
        })
    ;
    /**
     * 成功回调
     */
    jqXHR.done(function (data) {
        if (data) {
            $("#error").html("<span style = 'color : green'>手机号可以使用</span>");
        } else {
            $("#error").html("<span style = 'color : #ff1124'>手机已经被占用</span>");
        }
    });
}
