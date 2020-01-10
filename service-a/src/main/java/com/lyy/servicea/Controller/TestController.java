package com.lyy.servicea.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/1/10.
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
