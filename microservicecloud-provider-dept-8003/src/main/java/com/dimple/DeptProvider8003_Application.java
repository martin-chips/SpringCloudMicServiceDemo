package com.dimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @className: DeptProvider8001_Application
 * @description:
 * @auther: Dimple
 * @date: 08/01/19
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider8003_Application {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003_Application.class, args);
    }
}
