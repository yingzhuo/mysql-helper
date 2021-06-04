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

import com.github.yingzhuo.mysqlhelper.domain.DatabaseMeta;
import com.github.yingzhuo.mysqlhelper.domain.Version;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 应卓
 */
public interface CommonService {

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

    /**
     * 获取所有数据库的元数据
     *
     * @return 数据库元数据
     */
    public List<DatabaseMeta> getAllDatabaseMetas();

    /**
     * 获取所有数据库名称
     *
     * @return 所有数据库名称
     */
    public default List<String> getAllDatabaseNames() {
        return getAllDatabaseMetas()
                .stream()
                .map(DatabaseMeta::getDatabaseName)
                .collect(Collectors.toList());
    }

}
