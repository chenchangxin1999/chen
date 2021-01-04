package com.qy25.cn.mapper.base;

import com.qy25.cn.vo.PageVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author ChenChangXin
 * @Date 2021/1/1 20:29
 */
public interface BaseMapper<T,ID> {
    long countByExample(Object obj);

    int deleteByExample(Object obj);

    int deleteByPrimaryKey(ID id);

    int insert(T t);

    int insertSelective(T t);

    List<T> selectByExample(Object ojb);

    T selectByPrimaryKey(ID id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") Object example);

    int updateByExample(@Param("record") T record, @Param("example") Object example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
