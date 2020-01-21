package com.cky.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.cky.service.hello.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author chenkeyu
 * @date 2020/1/21 15:52
 */
@Slf4j
@Component
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String runHello(String args) {
        String result = String.format("HelloServiceImpl runHello %s", args);
        log.info("{}", result);
        return result;
    }
}
