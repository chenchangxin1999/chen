package com.qy25.cn.mapper;

import com.qy25.cn.dto.GoodsFindDto;
import com.qy25.cn.entity.Goods;
import com.qy25.cn.mapper.base.BaseMapper;

import java.util.List;

public interface GoodsMapper extends BaseMapper<Goods,Long> {

    List<Goods> findAll(GoodsFindDto dto);

    Long findTotal();
}