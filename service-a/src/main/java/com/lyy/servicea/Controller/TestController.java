package com.lyy.servicea.Controller;

import com.lyy.servicea.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/1/10.
 */
@RestController
public class TestController {
    @Autowired
    private UserService userService;
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello() {
       /* //访问报错，原因是feign的默认请求超时时间是1s，而延时1.5秒后返回数据报错。可以通过在yml配置文件中设置超时时间解决
        try{
            Thread.sleep(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return userService.queryAll();*/
       return "hello world"+" 端口："+port;
    }
}
