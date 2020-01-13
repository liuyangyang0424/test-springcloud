package com.objcat;

import com.objcat.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy  //开启网关
public class ServiceZuulApplication {

    //访问a服务，网关的地址 + 网关的端口号 + 服务的别名路径(配置文件中配置) + api名称
    //localhost:8087/service-a/hello
    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }

    //实例化出来，一定不要忘记写，否则网关不生效
    @Bean
    TokenFilter tokenFilter(){
        return new TokenFilter();
    }

}
