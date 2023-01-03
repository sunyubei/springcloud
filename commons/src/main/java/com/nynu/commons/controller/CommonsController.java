package com.nynu.commons.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/commons")
public class CommonsController {

    @Value("${server.port}")
    private String SERVER_PORT;

    @Value("${my.config}")
    private String config;

    @GetMapping("/commons/{id}")
    public String commons(@PathVariable("id") String id){
        return "commons service provider " + SERVER_PORT + " " + id + " config: " + config;
    }

}
