package com.github.yingzhuo.mysqlhelper.service;

import com.github.yingzhuo.mysqlhelper.dao.VersionDao;
import com.github.yingzhuo.mysqlhelper.domain.Version;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VersionServiceImpl implements VersionService {

    private final VersionDao versionDao;

    public VersionServiceImpl(VersionDao versionDao) {
        this.versionDao = versionDao;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public Version getVersion() {
        return versionDao.get();
    }

}
