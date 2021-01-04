package com.qy25.cn.controller;

import com.qy25.cn.controller.Base.BaseController;
import com.qy25.cn.entity.Supplier;
import com.qy25.cn.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author ChenChangXin
 * @Date 2021/1/1 20:02
 * @Version 1.0
 */
@RestController
@RequestMapping("supplier")
public class SupplierController extends BaseController<Supplier,Long> {

}
