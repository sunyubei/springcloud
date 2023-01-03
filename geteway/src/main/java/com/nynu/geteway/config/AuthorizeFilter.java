package com.nynu.geteway.config;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Author: 王纪勇
 * @Date: 2022/4/29 16:18
 * @Description: 定义全局过滤器，拦截请求
 */

@Component
public class AuthorizeFilter implements GlobalFilter, Ordered {

    private static final String AUTHORIZATION_SECRET = "admin";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        //获取请求参数
        HttpHeaders headers = exchange.getRequest().getHeaders();

        //获取authorization参数
        String author = headers.getFirst("authorization");
        //校验
        if (AUTHORIZATION_SECRET.equals(author)){
            return chain.filter(exchange);
        }
        //拦截
        //禁止访问设置状态码
        exchange.getResponse().setStatusCode(HttpStatus.FORBIDDEN);
        //结束处理
        return exchange.getResponse().setComplete();

    }

    @Override
    public int getOrder() {
        return 0;
    }

}
