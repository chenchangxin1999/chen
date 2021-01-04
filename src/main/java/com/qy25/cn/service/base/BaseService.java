package com.qy25.cn.service.base;

import com.qy25.cn.vo.PageVo;

import java.util.List;

/**
 * @Author ChenChangXin
 * @Date 2021/1/2 9:58
 * @Version 1.0
 */
public interface BaseService<T,ID> {
    /**
     * 分页查询
     */
    PageVo<T> findPage();

    /**
     * 有条件的分页查询
     */
    PageVo<T> findPage(Object obj);

    /**
     * 通过id查
     */
    T findById(ID id);

    /**
     * 修改操作
     */
    int updateEntity(T entity);

    /**
     * 添加操作
     */
    int addEntity(T entity);

    /**
     * 删除操作
     */
    int deleteById(ID id);

    /**
     * 批量添加
     */
    int batchAddEntity(List<T> list);

    /**
     * 批量修改
     */
    int batchUpdateEntity(List<T> list);

    /**
     * 批量删除
     */
    int abatchDeleteByIds(List<ID> ids);

    /**
     * 封装分页数据
     */
    PageVo<T> setPageVo(List<T> list);
}
