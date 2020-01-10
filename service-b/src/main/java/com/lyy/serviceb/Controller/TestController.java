package com.lyy.serviceb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/1/10.
 */
@RestController
public class TestController {
    @Autowired
    private ServiceAFeignClient serviceAFeignClient;

    @RequestMapping("/call")
    public String call(){
        String result = serviceAFeignClient.hello();
        return " b to a 访问结果 ------"+result;
    }

}
