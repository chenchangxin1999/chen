package com.qy25.cn.service.impl;
import com.qy25.cn.dto.GoodsFindDto;
import com.qy25.cn.entity.Goods;
import com.qy25.cn.mapper.GoodsMapper;
import com.qy25.cn.service.GoodsService;
import com.qy25.cn.service.base.impl.BaseServiceImpl;
import com.qy25.cn.vo.PageVo;
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
public class GoodsServiceImpl extends BaseServiceImpl<Goods, Long> implements GoodsService {


    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public PageVo<Goods> findAllPage(GoodsFindDto dto) {
        List<Goods> list = goodsMapper.findAll(dto);
        Long total = goodsMapper.findTotal();
        PageVo pageVo = new PageVo();
        pageVo.setList(list);
        pageVo.setTotal(total);
        return pageVo;
    }



    /**
     *查询
     */

}
