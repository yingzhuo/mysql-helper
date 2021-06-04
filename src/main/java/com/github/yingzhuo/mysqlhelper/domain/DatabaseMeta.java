package com.github.yingzhuo.mysqlhelper.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class DatabaseMeta implements Serializable {

    private String databaseName;
    private String defaultCharsetName;
    private String defaultCollationName;

}
