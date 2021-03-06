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
import com.github.yingzhuo.mysqlhelper.domain.DatabaseMeta;
import com.github.yingzhuo.mysqlhelper.domain.Version;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
class CommonServiceImpl extends AbstractServiceBase implements CommonService {

    public CommonServiceImpl(FocusOn focusOn, SqlSession sqlSession) {
        super(focusOn, sqlSession);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public Version getVersion() {
        return sqlSession.selectOne("Common.getVersion");
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<DatabaseMeta> getAllDatabaseMetas() {
        return sqlSession.selectList("Common.getAllDatabaseMetas");
    }

}
