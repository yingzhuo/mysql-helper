/*

 __  __       ____   ___  _       _   _      _
|  \/  |_   _/ ___| / _ \| |     | | | | ___| |_ __   ___ _ __
| |\/| | | | \___ \| | | | |     | |_| |/ _ \ | '_ \ / _ \ '__|
| |  | | |_| |___) | |_| | |___  |  _  |  __/ | |_) |  __/ |
|_|  |_|\__, |____/ \__\_\_____| |_| |_|\___|_| .__/ \___|_|
        |___/                                 |_|

https://github.com/yingzhuo/mysql-helper
*/
package com.github.yingzhuo.mysqlhelper.json;

import lombok.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Json implements Serializable {

    private String code = "200";

    private String error = null;

    @Singular("entry")
    private Map<String, Object> data = new HashMap<>();

}
