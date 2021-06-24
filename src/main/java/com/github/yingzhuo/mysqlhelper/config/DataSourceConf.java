package com.github.yingzhuo.mysqlhelper.config;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author 应卓
 */
@Slf4j
@Validated
@Component
@ConfigurationProperties(prefix = "mysql-helper.datasource")
@Getter
@Setter
public class DataSourceConf implements InitializingBean, Serializable {

    @NotEmpty
    private String host;

    @Min(1)
    @Max(65535)
    private int port = 3306;

    @NotEmpty
    private String defaultDatabaseName = "mysql";

    @NotEmpty
    private String username = "root";

    @NotEmpty
    private String password = "root";

    @Override
    public void afterPropertiesSet() {
        log.debug("DataSource - host: {}", host);
        log.debug("DataSource - port: {}", port);
        log.debug("DataSource - username: {}", username);
        log.debug("DataSource - password: {}", password);
    }

}
