package com.nynu.baseseparation.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public interface BaseSeparationService {

    String getInfoById(@PathVariable("id") String id);

}
