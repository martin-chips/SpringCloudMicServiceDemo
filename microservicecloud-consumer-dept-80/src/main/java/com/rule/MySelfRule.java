package com.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className: MySelfRule
 * @description:
 * @auther: Dimple
 * @date: 08/01/19
 * @version: 1.0
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        return new RandomRule();//Ribbon默认是轮询，我自定义为随机
    }
}
