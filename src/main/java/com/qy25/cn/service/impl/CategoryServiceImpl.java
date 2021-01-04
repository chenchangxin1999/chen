package com.qy25.cn.service.impl;

import com.qy25.cn.entity.Category;
import com.qy25.cn.service.CategoryService;
import com.qy25.cn.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author ChenChangXin
 * @Date 2021/1/1 19:56
 * @Version 1.0
 */
@Service
@Transactional//事务
public class CategoryServiceImpl extends BaseServiceImpl<Category, Long> implements CategoryService {

}
