package com.nynu.consumer1.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 王纪勇
 * @Date: 2022/4/21 14:37
 * @Description:
 */
@Configuration
public class ApplicationContextBean {

    @Bean
    //开启负载均衡（轮询）
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
