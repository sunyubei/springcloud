package com.nynu.consumer2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "springcloud-base-provider")
public interface Consumer2OpenFeignService {

//    String getInfoById(@PathVariable("id") String id);

    @GetMapping("/base/base/base/{id}")
    String base(@PathVariable("id") String id);

}
