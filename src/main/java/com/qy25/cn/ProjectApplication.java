package com.qy25.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author ChenChangXin
 * @Date 2021/1/1 19:40
 * @Version 1.0
 */
@SpringBootApplication//主配置类
@EnableTransactionManagement//开启事务
@MapperScan(basePackages = "com.qy25.cn.mapper")//mapper层包扫描
public class ProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class);
    }
}
