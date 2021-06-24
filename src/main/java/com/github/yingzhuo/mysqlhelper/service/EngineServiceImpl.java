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
import com.github.yingzhuo.mysqlhelper.domain.TableMetadata;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 应卓
 */
@Service
public class EngineServiceImpl extends AbstractServiceBase implements EngineService {

    public EngineServiceImpl(FocusOn focusOn, SqlSession sqlSession) {
        super(focusOn, sqlSession);
    }

    @Override
    public List<TableMetadata> findTableMetadataByNotEngine(String engine) {
        if (StringUtils.isBlank(engine)) {
            return Collections.emptyList();
        }

        Map<String, Object> params = new HashMap<>();
        params.put("engine", engine);
        params.put("focus", super.focusDatabases);
        return sqlSession.selectList("Engine.findByNotEngine", params);
    }

}
