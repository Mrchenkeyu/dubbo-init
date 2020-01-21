package com.cky.dubboconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cky.service.hello.HelloService;
import com.cky.service.test.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author chenkeyu
 * @date 2020/1/21 16:00
 */
@Service
@Slf4j
public class ConsumerService {

    @Reference
    private HelloService helloService;

    @Reference
    private TestService testService;

    @PostConstruct
    private void init() {
        log.info("HelloService:{} | TestService:{}", helloService, testService);
    }

    @Scheduled(fixedRate = 5000L)
    public void run() {
        String hello = helloService.runHello("ConsumerService");
        String test = testService.runTest();
        log.info("hello:{} | test:{}", hello, test);
    }


}
