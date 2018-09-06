/**
 * Date 2018/6/21.
 * Author PeiWei
 */

//获取url
function getUrl() {
    if (true)
        return "http://127.0.0.1:8080";
    else
        return "https://*****"
}

//验证电子邮箱
function checkEmail(str) {
    var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"); //正则表达式
    if (str.value === "") { //输入不能为空
        return -1;
    } else if (!reg.test(obj.value)) { //正则验证不通过，格式不对
        return 0;
    } else { //正则验证通过
        return 1;
    }
}

function isNumber(val) {
    var regPos = /^\d+(\.\d+)?$/; //非负浮点数
    var regNeg = /^(-(([0-9]+\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\.[0-9]+)|([0-9]*[1-9][0-9]*)))$/; //负浮点数
    if (regPos.test(val) || regNeg.test(val)) {
        return true;
    } else {
        return false;
    }

}
//验证密码 密码强度正则，最少6位，包括至少1个大写字母，1个小写字母，1个数字，1个特殊字符
function checkName(str) {
    var reg = new RegExp("^.*(?=.{6,})(?=.*\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*? ]).*$"); //正则表达式
    if (str.value === "") { //输入不能为空
        return -1;
    } else if (!reg.test(obj.value)) { //正则验证不通过，格式不对
        return 0;
    } else { //正则验证通过
        return 1;
    }
}

function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]);
    return null;
}
