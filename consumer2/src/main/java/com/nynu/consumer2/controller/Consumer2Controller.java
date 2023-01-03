package com.nynu.consumer2.controller;

import com.nynu.consumer2.service.Consumer2OpenFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/consumer2")
public class Consumer2Controller {

    @Autowired
    private Consumer2OpenFeignService consumer2OpenFeignService;

    @GetMapping(value = "/openFeignTest/{id}")
    public String openFeignTest(@PathVariable("id") String id){
        String infoById = consumer2OpenFeignService.base(id);
        return infoById;
    }

}
