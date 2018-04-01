//页面加载时候,请求参数
$(function () {
    loadchargeItems();
    loadChargeDetails();
});

function loadChargeDetails(){
    var jqXHR = $.ajax({
        url: "/allocate/allocateBusiness.action",
        dataType: "json",
        method: "POST"
    });
    //成功回调方法
    jqXHR.done(function (data) {
        for (i in data) {

            $("#chargeItems").append("<option value='"+data[i].chargeItemId+"'>"+data[i].chargeItemName+"</option>");
        }

    });
    jqXHR.fail(function () {
        alert("请求服务端错误");
    });
}
function loadchargeItems(){
    var jqXHR = $.ajax({
        url: "/allocate/loadchargeItems.action",
        dataType: "json",
        method: "POST"
    });
    //成功回调方法
    jqXHR.done(function (data) {
        for (i in data) {
            $("#charge").append("<input type='checkbox' name='businessList["+i+"].chargeItemId'value="+data[i].chargeItemId+">"+data[i].chargeItemName+"").append("<input type = 'hidden' name ='businessList["+i+"].state' value='1'></input>");
        }

    });
    jqXHR.fail(function () {
        alert("请求服务端错误");
    });
}