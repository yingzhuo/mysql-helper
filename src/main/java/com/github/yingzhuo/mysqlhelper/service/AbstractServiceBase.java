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

import com.github.yingzhuo.mysqlhelper.config.FocusOn;
import org.apache.ibatis.session.SqlSession;

import java.util.Set;

/**
 * @author 应卓
 */
abstract class AbstractServiceBase {

    protected final SqlSession sqlSession;
    private final FocusOn focusOn;

    public AbstractServiceBase(FocusOn focusOn, SqlSession sqlSession) {
        this.focusOn = focusOn;
        this.sqlSession = sqlSession;
    }

    protected final Set<String> getFocusDatabases() {
        return focusOn.getDatabases();
    }

}
