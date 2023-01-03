package com.nynu.base.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public interface BaseService {

    String getInfoById(@PathVariable("id") String id);

}
