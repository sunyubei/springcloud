package com.nynu.base.controller;

import com.nynu.base.service.BaseService;
import org.omg.CORBA.TIMEOUT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

//动态刷新服务配置
@RefreshScope
@RestController
@RequestMapping("/base")
public class BaseController {

    @Value("${server.port}")
    private String SERVER_PORT;

    @Value("${user.names}")
    private String name;

    @Value("${my.config}")
    private String config;

    @Autowired
    private BaseService baseService;

    @GetMapping("/base/{id}")
    public String base(@PathVariable("id") String id){
        String str = baseService.getInfoById(id);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        return "base service provider " + SERVER_PORT + " " + id + " name: " + name + " myConfig:" + config;
        return str;
    }

}