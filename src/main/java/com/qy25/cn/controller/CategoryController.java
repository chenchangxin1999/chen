package com.qy25.cn.controller;

import com.github.pagehelper.PageHelper;
import com.qy25.cn.controller.Base.BaseController;
import com.qy25.cn.entity.Category;
import com.qy25.cn.http.AxiosResult;
import com.qy25.cn.service.CategoryService;
import com.qy25.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @Author ChenChangXin
 * @Date 2021/1/1 20:02
 * @Version 1.0
 */
@RestController
@RequestMapping("category")
public class CategoryController extends BaseController {

    @Autowired
    private CategoryService categoryService;

   @GetMapping("getTreeData")
   public AxiosResult<List<Category>>getTreeData(){
       List<Category> list = categoryService.getTreeData();
       return AxiosResult.success(list);

   }


    @GetMapping("{id}")
    public AxiosResult<Category> findById(@PathVariable Long id) {
        return AxiosResult.success(categoryService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Category entity) {
        int i = categoryService.addEntity(entity);
        return toAxios(i);
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Category entity) {
        int i = categoryService.updateEntity(entity);
        return toAxios(i);
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteById(@PathVariable List<Long> ids) {
        return  toAxios(categoryService.batchDeleteByIds(ids));
    }
    
}
