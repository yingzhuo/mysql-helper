package com.github.yingzhuo.mysqlhelper.service;

import com.github.yingzhuo.mysqlhelper.domain.DatabaseAndTables;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class InnoDBServiceImpl implements InnoDBService {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<DatabaseAndTables> findNonInnoDBTables() {
        return sqlSession.selectList("InnoDB.findNonInnoDBTables");
    }

}
