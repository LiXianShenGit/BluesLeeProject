package com.lihaiqiao.gulimall.product;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.baidu.aip.util.Base64Util;
import com.lihaiqiao.gulimall.common.utils.AuthService;
import com.lihaiqiao.gulimall.common.utils.FileUtil;
import com.lihaiqiao.gulimall.common.utils.HttpUtil;
import com.lihaiqiao.gulimall.product.entity.BrandEntity;
import com.lihaiqiao.gulimall.product.service.BrandService;
import org.json.JSONException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URLEncoder;

@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;


    //设置APPID/AK/SK
    public static final String APP_ID = "23618975";
    public static final String API_KEY = "F2cnlbp4K8yHPA7EXEfBj3nH";
    public static final String SECRET_KEY = "Rj9rTVwSK9sq74K4mvF7C1MLzjmjSBHG";


    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("华为");
        brandService.save(brandEntity);
    }

    @Test
    public void testUpload() throws FileNotFoundException {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-hangzhou.aliyuncs.com";
        // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
        String accessKeyId = "LTAI4GAAuYApqWKe24jNPDAN";
        String accessKeySecret = "tTVkxEc3AS6ZSkKgbHchCmTvu8eQkw";

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        // 上传文件流。
        InputStream inputStream = new FileInputStream("C:\\Users\\DELL\\Pictures\\599e38dd7cb06_610.jpg");
        ossClient.putObject("lihaiqiao", "test.jpg", inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();
        System.out.println("上传成功");
    }

    @Test
    public void test3() throws JSONException {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/ocr/v1/business_license";
        try {
            // 本地文件路径
            String filePath = "E:\\IDEAWorkspace\\gulimall\\gulimall-product\\src\\main\\resources\\test.jpg";
            byte[] imgData = FileUtil.readFileByBytes(filePath);
            String imgStr = Base64Util.encode(imgData);
            String imgParam = URLEncoder.encode(imgStr, "UTF-8");

            String param = "image=" + imgParam;

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = AuthService.getAuth(API_KEY, SECRET_KEY);

            String result = HttpUtil.post(url, accessToken, param);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
