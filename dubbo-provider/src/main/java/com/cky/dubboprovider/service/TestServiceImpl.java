package com.cky.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.cky.service.test.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author chenkeyu
 * @date 2020/1/21 15:54
 */
@Slf4j
@Component
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String runTest() {
        String result = "TestServiceImpl runTest";
        log.info("{}", result);
        return result;
    }
}
