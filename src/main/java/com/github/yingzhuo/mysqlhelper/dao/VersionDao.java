package com.github.yingzhuo.mysqlhelper.dao;

import com.github.yingzhuo.mysqlhelper.domain.Version;

@FunctionalInterface
public interface VersionDao {

    public Version get();

}
