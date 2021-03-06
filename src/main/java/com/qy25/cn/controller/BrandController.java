package com.qy25.cn.controller;

import com.github.pagehelper.PageHelper;
import com.qy25.cn.controller.Base.BaseController;
import com.qy25.cn.entity.Brand;
import com.qy25.cn.entity.Category;
import com.qy25.cn.http.AxiosResult;
import com.qy25.cn.service.BrandService;
import com.qy25.cn.utill.UploadFile;
import com.qy25.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author ChenChangXin
 * @Date 2021/1/1 20:02
 * @Version 1.0
 */
@RestController
@RequestMapping("brand")
public class BrandController extends BaseController {

    @Autowired
    private BrandService brandService;

    @GetMapping
    public AxiosResult<PageVo<Brand>> findPage(@RequestParam(defaultValue = "1") int currentPage,
                                               @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Brand> page = brandService.findPage();
        return AxiosResult.success(page);
    }

    //没有分页查询
    @GetMapping("getTreeData")
    public AxiosResult<List<Brand>> getTreeData() {
        List<Brand> list = brandService.findAllName();
        return AxiosResult.success(list);
    }

    @GetMapping("{id}")
    public AxiosResult<Brand> findById(@PathVariable Long id) {
        return AxiosResult.success(brandService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Brand entity) {
        int i = brandService.addEntity(entity);
        return toAxios(i);
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Brand entity) {
        int i = brandService.updateEntity(entity);
        return toAxios(i);
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteById(@PathVariable List<Long> ids) {
        return toAxios(brandService.batchDeleteByIds(ids));
    }

    /**
     * 文件上传
     */
    @PostMapping("file")
    public AxiosResult<String> file(HttpServletRequest request) throws IOException, ServletException {
        Part part = request.getPart("file");
        String s = "";
        try {
            InputStream inputStream = part.getInputStream();
            s = UUID.randomUUID().toString().replaceAll("-", "");
            UploadFile.uploadFile(inputStream, s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String url = "https://chenchangxin.oss-cn-beijing.aliyuncs.com/" + s + ".jpg";

        return AxiosResult.success(url);
    }
}
