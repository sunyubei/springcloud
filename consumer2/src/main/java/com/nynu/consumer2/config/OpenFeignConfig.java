package com.nynu.consumer2.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 王纪勇
 * @Date: 2022/6/4 14:45
 * @Description: OpenFeign日志增强
 */

@Configuration
public class OpenFeignConfig {

    //四个日志级别: NONE: 默认的，不显示任何日志
    //            BASIC: 仅记录请求方法，URL,响应状态码以及执行时间
    //            HEADERS: 除了BASIC中定义的信息以外，还有请求和响应头的信息
    //            FULL: 除了HEADRES中定义的信息外，还有请求和响应的正文以及元数据
    @Bean
    Logger.Level openFeignLoggerLevel(){
        return Logger.Level.FULL;
    }

}
