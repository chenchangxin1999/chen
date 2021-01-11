package com.qy25.cn.controller;

import com.github.pagehelper.PageHelper;
import com.qy25.cn.controller.Base.BaseController;
import com.qy25.cn.dto.GoodsFindDto;
import com.qy25.cn.entity.Category;
import com.qy25.cn.entity.Goods;
import com.qy25.cn.http.AxiosResult;
import com.qy25.cn.service.GoodsService;
import com.qy25.cn.service.GoodsService;
import com.qy25.cn.utill.UploadFile;
import com.qy25.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

/**
 * @Author ChenChangXin
 * @Date 2021/1/1 20:02
 * @Version 1.0
 */
@RestController
@RequestMapping("goods")
public class GoodsController extends BaseController {

    @Autowired
    private GoodsService goodsService;

    @PostMapping("findAll")
    public AxiosResult<PageVo<Goods>> findPage(@RequestParam(defaultValue = "1") int currentPage,
                                               @RequestParam(defaultValue = "5") int pageSize,
                                               @RequestBody GoodsFindDto entity) {
       /* PageHelper.startPage(currentPage, pageSize);
        PageVo<Goods> page = goodsService.findPage();*/
        System.out.println(pageSize);
        System.out.println(currentPage);
        System.out.println(entity);
        System.out.println("11111111111111111111");
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Goods> list = goodsService.findAllPage(entity);
        return AxiosResult.success(list);
    }

    /**
     * 带条件查询！
     * 前端还没写分页相关
     *
     * @param id
     * @return
     */


    @GetMapping("{id}")
    public AxiosResult<Goods> findById(@PathVariable Long id) {
        return AxiosResult.success(goodsService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Goods entity) {
        System.out.println(entity);
        int i = goodsService.addEntity(entity);
        return toAxios(i);
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Goods entity) {
        int i = goodsService.updateEntity(entity);
        return toAxios(i);
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteById(@PathVariable List<Long> ids) {
        return toAxios(goodsService.batchDeleteByIds(ids));
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
        String url = "https://chenchangxin.oss-cn-beijing.aliyuncs.com/" + "goods/" + s + ".jpg";

        return AxiosResult.success(url);
    }
}
