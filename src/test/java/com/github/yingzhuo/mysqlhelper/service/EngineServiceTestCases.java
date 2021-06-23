package com.github.yingzhuo.mysqlhelper.service;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EngineServiceTestCases {

    @Autowired
    private EngineService engineService;

    @Test
    @DisplayName("findByEngine by 'innodb'")
    public void test1() {
        val list = engineService.findByEngine("innodb");
        list.forEach(System.out::println);
    }

    @Test
    @DisplayName("findByNotEngine by 'innodb'")
    public void test2() {
        val list = engineService.findByNotEngine("innodb");
        list.forEach(System.out::println);
    }

}
