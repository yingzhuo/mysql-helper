package com.github.yingzhuo.mysqlhelper.service;

import com.github.yingzhuo.mysqlhelper.domain.DatabaseAndTables;

import java.util.List;

public interface InnoDBService {

    public List<DatabaseAndTables> findNonInnoDBTables();

}
