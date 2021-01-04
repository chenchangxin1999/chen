package com.qy25.cn.entity.base;

import lombok.Data;

import java.util.Date;

/**
 * @Author ChenChangXin
 * @Date 2021/1/2 14:39
 * @Version 1.0
 */
@Data
public class BaseEntity {
    private Long id;

    private Date addTime;

    private Long creatorId;

    private Date updateTime;

    private Long updateId;
}
