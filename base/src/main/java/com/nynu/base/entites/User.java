package com.nynu.base.entites;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@ToString
public class User implements Serializable {

    @Value("${base.baseinfo}")
    private String baseinfo;

}
