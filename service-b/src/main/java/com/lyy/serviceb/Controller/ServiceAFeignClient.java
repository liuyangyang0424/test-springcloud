package com.lyy.serviceb.Controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2020/1/10.
 */
@FeignClient("SERVICE-OBJCAT-A")
public interface ServiceAFeignClient {
    @RequestMapping("hello")
    public String hello();
}
