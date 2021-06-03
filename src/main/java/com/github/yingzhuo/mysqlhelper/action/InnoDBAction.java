/*

 __  __       ____   ___  _       _   _      _
|  \/  |_   _/ ___| / _ \| |     | | | | ___| |_ __   ___ _ __
| |\/| | | | \___ \| | | | |     | |_| |/ _ \ | '_ \ / _ \ '__|
| |  | | |_| |___) | |_| | |___  |  _  |  __/ | |_) |  __/ |
|_|  |_|\__, |____/ \__\_\_____| |_| |_|\___|_| .__/ \___|_|
        |___/                                 |_|

https://github.com/yingzhuo/mysql-helper
*/
package com.github.yingzhuo.mysqlhelper.action;

import com.github.yingzhuo.mysqlhelper.json.Json;
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
    Json checkTables() {
        return Json.builder()
                .entry("tables", this.service.findNonInnoDBTables())
                .build();
    }

}
