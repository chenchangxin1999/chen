package com.qy25.cn.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @Author ChenChangXin
 * @Date 2021/1/2 11:21
 * @Version 1.0
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL) //转json的时候 只转值不为null的；
public class AxiosResult<T> {
    /**
     * 统一返回值
     */
    private int status;
    private String message;
    private T data;

    private AxiosResult() {

    }

    /**
     * 成功的返回自定义状态码+数据
     *
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus, T data) {
        return setData(axiosStatus, data);
    }

    /**
     * 成功返回自定义状态码
     *
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus) {
        return setData(axiosStatus, null);
    }

    /**
     * 成功的时候返回携带数据
     *
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success(T data) {
        return setData(AxiosStatus.OK, data);
    }

    /**
     * 成功的时候返回的方法
     *
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success() {
        return setData(AxiosStatus.OK, null);
    }

    /**
     * 错误时候返回的方法
     *
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error() {
        return setData(AxiosStatus.ERROR, null);
    }

    /**
     * 错误时候返回加数据
     *
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(T data) {
        return setData(AxiosStatus.ERROR, data);
    }

    /**
     * 错误时候返回自定义状态码
     *
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus) {
        return setData(axiosStatus, null);
    }

    /**
     * 错误时候返回自定义状态码加数据
     *
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus, T data) {
        return setData(axiosStatus, data);
    }


    /**
     * 封装数据方法
     *
     * @param axiosStatus
     * @param data
     * @param <T>
     * @return
     */
    private static <T> AxiosResult<T> setData(AxiosStatus axiosStatus, T data) {
        AxiosResult<T> axiosResult = new AxiosResult<>();
        axiosResult.setData(data);
        axiosResult.setMessage(axiosStatus.getMessage());
        axiosResult.setStatus(axiosStatus.getStatus());
        return axiosResult;
    }

}
