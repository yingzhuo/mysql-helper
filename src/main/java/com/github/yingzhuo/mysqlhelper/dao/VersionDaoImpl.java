package com.github.yingzhuo.mysqlhelper.dao;

import com.github.yingzhuo.mysqlhelper.domain.Version;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
class VersionDaoImpl implements VersionDao {

    private final SqlSession sqlSession;

    public VersionDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public Version get() {
        return sqlSession.selectOne("Version.get");
    }

}
