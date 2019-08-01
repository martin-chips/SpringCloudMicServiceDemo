package com.dimple.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @className: CommonConfig
 * @description:
 * @auther: Dimple
 * @date: 08/01/19
 * @version: 1.0
 */
@Configuration
public class CommonConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
