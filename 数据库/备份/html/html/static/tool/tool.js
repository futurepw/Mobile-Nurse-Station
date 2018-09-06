/**
 * Date 2018/6/21.
 * Author PeiWei
 */

//获取url
function getUrl() {
    if (true)
        return "127.0.0.1:8080";
    else
        return "123.206.206.174:8080"
}

//验证电子邮箱
function checkEmail(str){
    var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"); //正则表达式
    if(str.value === ""){ //输入不能为空
        return -1;
    }else if(!reg.test(obj.value)){ //正则验证不通过，格式不对
        return 0;
    }else{ //正则验证通过
        return 1;
    }
}
//验证用户名 用户名正则，4到16位（字母，数字，下划线，减号）
function checkName(str){
    var reg = new RegExp("^[a-zA-Z0-9_-]{4,16}$"); //正则表达式
    if(str.value === ""){ //输入不能为空
        return -1;
    }else if(!reg.test(obj.value)){ //正则验证不通过，格式不对
        return 0;
    }else{ //正则验证通过
        return 1;
    }
}

//验证密码 密码强度正则，最少6位，包括至少1个大写字母，1个小写字母，1个数字，1个特殊字符
function checkName(str){
    var reg = new RegExp("^.*(?=.{6,})(?=.*\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*? ]).*$"); //正则表达式
    if(str.value === ""){ //输入不能为空
        return -1;
    }else if(!reg.test(obj.value)){ //正则验证不通过，格式不对
        return 0;
    }else{ //正则验证通过
        return 1;
    }
}
function getPaitenttable(str) {

    $.ajax({
        type: 'get',
        url: '../data/test.json',
        dataType: 'json',
        success: function(data) {

            if(data.status == 0) {

                $.each(data.data, function(i, item) {
                    // $("#pat_tb").append("<li class=\"mui-table-view-cell mui-media\"><a href=\"javascript:;\"><div class=\"mui-media-body\">"+item.name+"<p class='mui-ellipsis'>病房号："+item.病房号+"</p><p class='mui-pull-right'>病床号："+item.病床号+"</p></div></a></li>")
                    $("#pat_tb").append("<li class=\"mui-table-view-cell\"><div class=\"mui-slider-cell\"><div class=\"oa-contact-cell mui-table\"><div class=\"oa-contact-content mui-table-cell\"><div class=\"mui-clearfix\"><h4 class=\"oa-contact-name\">"+item.name+"</h4><span class=\"oa-contact-position mui-h6\">病床号："+item.病床号+	"</span></div><p class=\"oa-contact-email mui-h6\">病房号："+item.病房号+"</p></div></div></div></li>");
                });
            } else {
                alert("网络错误！")
                console.error("连接到后端失败！")
            }
        }

    })
}
function first_load () {
    $("#selPaitent").load('sel_patient.html');
}
