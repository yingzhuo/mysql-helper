package com.github.yingzhuo.mysqlhelper.service;

import com.github.yingzhuo.mysqlhelper.domain.Version;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
class VersionServiceImpl implements VersionService {

    @Autowired
    private SqlSession sqlSession;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public Version getVersion() {
        return sqlSession.selectOne("Version.get");
    }

}
