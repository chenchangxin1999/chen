package com.qy25.cn.entity.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author ChenChangXin
 * @Date 2021/1/2 14:39
 * @Version 1.0
 */
@Data
public class BaseEntity {
    private Long id;

    private LocalDateTime addTime;

    private Long creatorId;

    private LocalDateTime updateTime;

    private Long updateId;

    public void setDate() {
        if (idNill()) {
            this.addTime = LocalDateTime.now();
            this.creatorId = 1L;
        } else {
            this.updateTime = LocalDateTime.now();
            this.updateId = 2L;
        }
    }

    public Boolean idNill() {
        if (id != null) {
            return false;
        } else {
            return true;
        }
    }
}
