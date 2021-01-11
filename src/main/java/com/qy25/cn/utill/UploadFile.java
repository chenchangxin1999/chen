package com.qy25.cn.utill;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectResult;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author ChenChangXin
 * @Date 2021/1/8 9:51
 * @Version 1.0
 */
public class UploadFile {

    public static void uploadFile(InputStream inputStream,String name) throws IOException {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-beijing.aliyuncs.com";
        //阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAI4G3Jy2EBY5bPfnoXX95R";
        String accessKeySecret = "DCf6pCnwHj0PWdg96kzal0upGmNlRQ";
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        // 上传网络流。
        ossClient.putObject("chenchangxin", name+".jpg", inputStream);
        // 关闭OSSClient。
        ossClient.shutdown();
    }
}
