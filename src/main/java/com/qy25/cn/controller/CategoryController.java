package com.qy25.cn.controller;

import com.qy25.cn.controller.Base.BaseController;
import com.qy25.cn.entity.Brand;
import com.qy25.cn.entity.Category;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ChenChangXin
 * @Date 2021/1/1 20:02
 * @Version 1.0
 */
@RestController
@RequestMapping("category")
public class CategoryController extends BaseController<Category,Long> {

}
