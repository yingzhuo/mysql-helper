package com.github.yingzhuo.mysqlhelper.action;

import com.github.yingzhuo.mysqlhelper.json.J;
import com.github.yingzhuo.mysqlhelper.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("version")
class VersionAction {

    @Autowired
    VersionService service;

    @GetMapping
    J get() {
        return J.builder()
                .entry("version", service.getVersion().toString())
                .build();
    }

}
