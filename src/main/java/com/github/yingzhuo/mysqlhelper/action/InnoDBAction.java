package com.github.yingzhuo.mysqlhelper.action;

import com.github.yingzhuo.mysqlhelper.json.J;
import com.github.yingzhuo.mysqlhelper.service.InnoDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("innodb")
class InnoDBAction {

    @Autowired
    InnoDBService service;

    @GetMapping("non-innodb")
    J checkTables() {
        return J.builder()
                .entry("tables", this.service.findNonInnoDBTables())
                .build();
    }

}
