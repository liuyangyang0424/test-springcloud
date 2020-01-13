package com.lyy.servicea.Controller;

import com.lyy.servicea.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/1/10.
 */
@RestController
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public Object hello(){
        return userService.queryAll();
    }
}
