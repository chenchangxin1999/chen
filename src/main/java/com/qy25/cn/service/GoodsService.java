package com.qy25.cn.service;

import com.qy25.cn.dto.GoodsFindDto;
import com.qy25.cn.entity.Brand;
import com.qy25.cn.entity.Goods;
import com.qy25.cn.service.base.BaseService;
import com.qy25.cn.vo.PageVo;
import com.sun.webkit.PageCache;

import java.util.List;

/**
 * @Author ChenChangXin
 * @Date 2021/1/1 19:53
 * @Version 1.0
 */
public interface GoodsService extends BaseService<Goods,Long> {

    PageVo<Goods> findAllPage(GoodsFindDto dto);

}
