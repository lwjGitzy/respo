package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient  //代表是eureka的客户端注册到注册中心
@ComponentScan("com.jk")
@MapperScan("com.jk.mapper")
public class SpringcloudProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProviderApplication.class, args);
    }


}
