package com.qy25.cn.service.impl;

import com.qy25.cn.entity.Brand;
import com.qy25.cn.entity.Category;
import com.qy25.cn.mapper.BrandMapper;
import com.qy25.cn.service.BrandService;
import com.qy25.cn.service.base.impl.BaseServiceImpl;
import com.qy25.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author ChenChangXin
 * @Date 2021/1/1 19:56
 * @Version 1.0
 */
@Service
@Transactional//事务
public class BrandServiceImpl extends BaseServiceImpl<Brand,Long> implements BrandService {


    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> findAllName() {
        return brandMapper.findAllName();
    }
}
