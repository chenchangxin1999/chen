package com.qy25.cn.controller.Base;

import com.github.pagehelper.PageHelper;
import com.qy25.cn.entity.Brand;
import com.qy25.cn.http.AxiosResult;
import com.qy25.cn.service.base.BaseService;
import com.qy25.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author ChenChangXin
 * @Date 2021/1/2 11:20
 * @Version 1.0
 */

public class BaseController {


    public AxiosResult<Void> toAxios(int row) {
        return row > 0 ? AxiosResult.success() : AxiosResult.error();
    }


}
