package com.github.yingzhuo.mysqlhelper.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class DatabaseAndTables implements Serializable {

    private Integer rowNumber;
    private String databaseName;
    private String tableNames;

}
