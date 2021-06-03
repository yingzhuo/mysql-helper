/*

 __  __       ____   ___  _       _   _      _
|  \/  |_   _/ ___| / _ \| |     | | | | ___| |_ __   ___ _ __
| |\/| | | | \___ \| | | | |     | |_| |/ _ \ | '_ \ / _ \ '__|
| |  | | |_| |___) | |_| | |___  |  _  |  __/ | |_) |  __/ |
|_|  |_|\__, |____/ \__\_\_____| |_| |_|\___|_| .__/ \___|_|
        |___/                                 |_|

https://github.com/yingzhuo/mysql-helper
*/
package com.github.yingzhuo.mysqlhelper.service;

import com.github.yingzhuo.mysqlhelper.domain.Version;

/**
 * @author 应卓
 */
@FunctionalInterface
public interface VersionService {

    /**
     * 获取数据库实例的版本号
     *
     * @return 版本号
     */
    public Version getVersion();

    /**
     * 获取数据库实例的版本号
     *
     * @return 版本号
     */
    public default String getVersionAsString() {
        return getVersion().toString();
    }

}
