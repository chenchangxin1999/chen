package com.qy25.cn.service.base.impl;

import com.github.pagehelper.PageInfo;
import com.qy25.cn.mapper.base.BaseMapper;
import com.qy25.cn.service.base.BaseService;
import com.qy25.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author ChenChangXin
 * @Date 2021/1/2 10:08
 * @Version 1.0
 */
public class BaseServiceImpl<T, ID> implements BaseService<T, ID> {

    @Autowired
    private BaseMapper<T, ID> baseMapper;


    @Override
    public PageVo<T> findPage() {
        return setPageVo(baseMapper.selectByExample(null));
    }

    @Override
    public PageVo<T> findPage(Object obj) {
        return setPageVo(baseMapper.selectByExample(obj));
    }

    @Override
    public T findById(ID id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateEntity(T entity) {
        return baseMapper.updateByPrimaryKey(entity);
    }

    @Override
    public int addEntity(T entity) {
        return baseMapper.insert(entity);
    }

    @Override
    public int deleteById(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    @Transactional
    @Override
    public int batchAddEntity(List<T> list) {
        list.forEach(item -> {
            baseMapper.insert(item);
        });
        return 1;
    }

    @Transactional
    @Override
    public int batchUpdateEntity(List<T> list) {
        list.forEach(item -> {
            baseMapper.updateByPrimaryKey(item);
        });
        return 1;
    }

    @Transactional
    @Override
    public int abatchDeleteByIds(List<ID> ids) {
        ids.forEach(id->{
            baseMapper.deleteByPrimaryKey(id);
        });
        return 1;
    }


    @Override
    public PageVo<T> setPageVo(List<T> list) {
        PageInfo pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        PageVo pageVo = new PageVo();
        pageVo.setList(list);
        pageVo.setTotal(total);
        return pageVo;
    }
}
