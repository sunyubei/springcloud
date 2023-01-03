package com.nynu.consumer1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RefreshScope
@RestController
@RequestMapping("/consumer1")
public class Consumer1Controller {

    @Value("${service-url.nacos-user-service}")
    private String SERVER_URL;

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/testController/{id}")
    public String testController(@PathVariable("id") String id){

        String[] strings = SERVER_URL.split(",");

        String object1 = restTemplate.getForObject(strings[0] + "/base/base/base/" + id, String.class);

        String object2 = restTemplate.getForObject(strings[1] + "/commons/commons/commons/" + id, String.class);

        return object1 + "      " + object2;

    }

}
