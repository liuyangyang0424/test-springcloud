package com.lyy.servicea.Controller;

import com.lyy.servicea.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/1/10.
 */

@RestController
@RefreshScope   //配置刷新
public class TestController {
    @Autowired
    private UserService userService;
    @Value("${server.port}")
    private String port;
    @Value("${name}")
    private String name;
    @RequestMapping("/testname")
    public String testname(){
        return name;
    }

   /* @HystrixCommand(fallbackMethod = "fallback")  //配置服务保护*/
    @RequestMapping("/hello")
    public String hello() {
       /* //访问报错，原因是feign的默认请求超时时间是1s，而延时1.5秒后返回数据报错。可以通过在yml配置文件中设置超时时间解决
        try{
            Thread.sleep(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return userService.queryAll();*/
        try{
            Thread.sleep(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
       return "hello world"+" 端口："+port;
    }
    /*//服务无法访问的情况下返回的默认数据
    String fallback(){
        return "服务器繁忙";
    }*/
}
