package com.nynu.baseseparation.controller;

import com.nynu.baseseparation.service.BaseSeparationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RefreshScope
@RestController
@RequestMapping("/base")
public class BaseSeparationController {

    @Value("${server.port}")
    private String SERVER_PORT;

    @Value("${base.info}")
    private String info;

    @Autowired
    private BaseSeparationService baseSeparationService;

    @GetMapping("/base/{id}")
    public String base(@PathVariable("id") String id){
//        return "base-separation service provider " + SERVER_PORT + " " + id;
        String str = baseSeparationService.getInfoById(id);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return str;
    }

    @GetMapping("/test/{id}")
    public String test(@PathVariable("id") String id){
        return id + info;
    }

}
