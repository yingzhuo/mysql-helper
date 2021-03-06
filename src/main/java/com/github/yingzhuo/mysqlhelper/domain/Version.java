/*

 __  __       ____   ___  _       _   _      _
|  \/  |_   _/ ___| / _ \| |     | | | | ___| |_ __   ___ _ __
| |\/| | | | \___ \| | | | |     | |_| |/ _ \ | '_ \ / _ \ '__|
| |  | | |_| |___) | |_| | |___  |  _  |  __/ | |_) |  __/ |
|_|  |_|\__, |____/ \__\_\_____| |_| |_|\___|_| .__/ \___|_|
        |___/                                 |_|

https://github.com/yingzhuo/mysql-helper
*/
package com.github.yingzhuo.mysqlhelper.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * MySQL 版本
 */
@Getter
@Setter
public class Version implements Serializable {

    private String version;

    @Override
    public String toString() {
        return version != null ? version : "null";
    }

}
