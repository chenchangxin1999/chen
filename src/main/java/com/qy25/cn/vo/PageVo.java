package com.qy25.cn.vo;

import lombok.Data;

import java.util.List;

/**
 * @Author ChenChangXin
 * @Date 2021/1/2 10:02
 * @Version 1.0
 */
@Data
public class PageVo<T> {
    private Long total;

    private List<T> list;
}
