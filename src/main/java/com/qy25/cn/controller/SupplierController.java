package com.qy25.cn.controller;

import com.github.pagehelper.PageHelper;
import com.qy25.cn.controller.Base.BaseController;
import com.qy25.cn.dto.Area;
import com.qy25.cn.entity.Supplier;
import com.qy25.cn.http.AxiosResult;
import com.qy25.cn.service.SupplierService;
import com.qy25.cn.utill.Json;
import com.qy25.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author ChenChangXin
 * @Date 2021/1/1 20:02
 * @Version 1.0
 */
@RestController
@RequestMapping("supplier")
public class SupplierController extends BaseController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping
    public AxiosResult<PageVo<Supplier>> findPage(@RequestParam(defaultValue = "1") int currentPage,
                                                  @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Supplier> page = supplierService.findPage();
        return AxiosResult.success(page);
    }

    /**
     * 查询地区
     *
     * @return
     */
    @GetMapping("findArea")
    public AxiosResult<Area> findArea(String param) {
        Area area = null;
        String url = "http://apis.juhe.cn/xzqh/query?key=1bd8feae87e394cde5fc77db90b3d61a&fid=";
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
                 area = Json.jsonToPojo(result, Area.class);
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return AxiosResult.success(area);
    }

    //没有分页查询
    @GetMapping("getTreeData")
    public AxiosResult<List<Supplier>> getTreeData() {
        List<Supplier> list = supplierService.findAll();
        return AxiosResult.success(list);
    }

    @GetMapping("{id}")
    public AxiosResult<Supplier> findById(@PathVariable Long id) {
        return AxiosResult.success(supplierService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Supplier entity) {

        int i = supplierService.addEntity(entity);
        return toAxios(i);
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Supplier entity) {
        int i = supplierService.updateEntity(entity);
        return toAxios(i);
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteById(@PathVariable List<Long> ids) {
        return toAxios(supplierService.batchDeleteByIds(ids));
    }
}
