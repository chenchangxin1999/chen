package com.qy25.cn.service.impl;

import com.qy25.cn.entity.Category;
import com.qy25.cn.mapper.CategoryMapper;
import com.qy25.cn.service.CategoryService;
import com.qy25.cn.service.base.impl.BaseServiceImpl;
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
public class CategoryServiceImpl extends BaseServiceImpl<Category, Long> implements CategoryService {


    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getTreeData() {
        //查询所有
        List<Category> categories = categoryMapper.selectByExample(null);
        //过滤一级数据
        List<Category> root = categories.stream().filter(category -> category.getOarentId().equals(0L)).collect(Collectors.toList());
        root.forEach(item->{
            getChildren(categories,item);
        });
        return root;
    }

    /**
     * 通过父id找孩子
     */
    public void getChildren(List<Category> categories,Category category){
        List<Category> childrenList = categories.stream().filter(item -> item.getOarentId().equals(category.getId())).collect(Collectors.toList());
        if (childrenList.size()>0){
            category.setChildren(childrenList);
            childrenList.forEach(item->{
                getChildren(categories,item);
            });
        }
    }
}
