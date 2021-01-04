package com.qy25.cn.controller.Base;

import com.github.pagehelper.PageHelper;
import com.qy25.cn.entity.Brand;
import com.qy25.cn.http.AxiosResult;
import com.qy25.cn.service.base.BaseService;
import com.qy25.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author ChenChangXin
 * @Date 2021/1/2 11:20
 * @Version 1.0
 */

public class BaseController<T, ID> {

    @Autowired
    private BaseService<T, ID> baseService;

    @GetMapping
    public AxiosResult<PageVo<T>> findPage(@RequestParam(defaultValue = "1") int currentPage,
                                           @RequestParam(defaultValue = "5") int PageSize) {
        PageHelper.startPage(currentPage, PageSize);
        PageVo<T> page = baseService.findPage();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<T> findById(@PathVariable ID id) {
        return AxiosResult.success(baseService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody T entity) {
        int i = baseService.addEntity(entity);
        return toAxios(i);
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody T entity) {
        int i = baseService.updateEntity(entity);
        return toAxios(i);
    }

    @DeleteMapping
    public AxiosResult<Void> deleteById(@PathVariable ID id) {
        int i = baseService.deleteById(id);
        return toAxios(i);
    }

    public AxiosResult<Void> toAxios(int row) {
        return row > 0 ? AxiosResult.success() : AxiosResult.error();
    }


}
