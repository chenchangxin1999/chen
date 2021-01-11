package com.qy25.cn.service.impl;

import com.qy25.cn.entity.Supplier;
import com.qy25.cn.mapper.SupplierMapper;
import com.qy25.cn.service.SupplierService;
import com.qy25.cn.service.base.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author ChenChangXin
 * @Date 2021/1/1 19:56
 * @Version 1.0
 */
@Service
@Transactional//事务
public class SupplierServiceImpl extends BaseServiceImpl<Supplier, Long> implements SupplierService {

    @Autowired
    private SupplierMapper supplierMapper;

    @Override
    public List<Supplier> findAll() {
        return supplierMapper.selectByExample(null);
    }
}
