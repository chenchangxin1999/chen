package com.qy25.cn.service;

import com.qy25.cn.entity.Supplier;
import com.qy25.cn.service.base.BaseService;

import java.util.List;

/**
 * @Author ChenChangXin
 * @Date 2021/1/1 19:53
 * @Version 1.0
 */
public interface SupplierService extends BaseService<Supplier,Long> {

    List<Supplier> findAll();
}
