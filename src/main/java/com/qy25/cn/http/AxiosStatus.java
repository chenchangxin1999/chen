package com.qy25.cn.http;

/**
 * @ClassNmae AxiosStatus
 * @Date 2020/12/22 20:11
 * @Author ChenChangXin
 */
public enum AxiosStatus {
        OK(20000,"操作成功"),
        EMAIL_SEND_SUCCESS(20000,"邮件已发送成功"),
        ERROR(50000,"操作失败"),
        EMPLOYEE_NOT_EXISTS(40002,"员工不存在"),
        ACCOUNT_NOT_ACTIVE(40003,"员工未激活"),
        ACCOUNT_IS_ACTIVE(40004,"账号已激活，请登录"),
        LINK_YI_SHIXIAO(40005,"链接已失效"),
        CODE_NOT_RIGHT(40006,"验证码不正确"),

    ;

    AxiosStatus(int status, String message) {
        this.status = status;
        this.message = message;
    }

    private int status;

    private String message;


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
