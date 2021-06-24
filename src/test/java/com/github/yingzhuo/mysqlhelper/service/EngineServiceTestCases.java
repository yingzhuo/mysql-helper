package com.github.yingzhuo.mysqlhelper.service;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@Slf4j
@SpringBootTest(args = {
        "--mysql-helper.focus.databases=playground"
})
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestPropertySource(properties = {"TEST=true"})
public class EngineServiceTestCases {

    @Autowired
    private EngineService engineService;

    @Test
    @DisplayName("测试: findTableMetadataByNotEngine")
    public void test1() {
        val list = engineService.findTableMetadataByNotEngine("myisam");
        list.forEach(System.out::println);
    }

}
