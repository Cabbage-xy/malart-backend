package com.cxy.malart.manager.aimanager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class YuAiCallStrategyTest {

    @Resource
    private YuAiCallStrategy yuAiCallStrategy;

    @Test
    void doChat() {
        String ans = yuAiCallStrategy.doChat("你好");
        System.out.println(ans);
    }
}