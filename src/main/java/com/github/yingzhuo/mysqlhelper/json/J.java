package com.github.yingzhuo.mysqlhelper.json;

import lombok.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class J implements Serializable {

    private String code = "200";

    private String error = null;

    @Singular("entry")
    private Map<String, Object> data = new HashMap<>();

}
