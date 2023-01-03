package com.nynu.base.service.serviceImpl;

import com.nynu.base.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class BaseServiceImpl implements BaseService {

    @Override
    public String getInfoById(@PathVariable("id") String id) {
        return "OpenFeign - base: " + id;
    }

}
