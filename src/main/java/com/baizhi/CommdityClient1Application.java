package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class CommdityClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(CommdityClient1Application.class, args);
    }

}
