package com.github.yingzhuo.mysqlhelper.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * MySQL 版本
 */
@Getter
@Setter
public class Version implements Serializable {

    private String version;

    @Override
    public String toString() {
        return version != null ? version : "null";
    }

}
