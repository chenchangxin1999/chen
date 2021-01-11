package com.qy25.cn.mapper;

import com.qy25.cn.entity.Brand;
import com.qy25.cn.mapper.base.BaseMapper;

import java.util.List;

public interface BrandMapper extends BaseMapper<Brand,Long> {
    List<Brand> findAllName();
}