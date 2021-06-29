/*

 __  __       ____   ___  _       _   _      _
|  \/  |_   _/ ___| / _ \| |     | | | | ___| |_ __   ___ _ __
| |\/| | | | \___ \| | | | |     | |_| |/ _ \ | '_ \ / _ \ '__|
| |  | | |_| |___) | |_| | |___  |  _  |  __/ | |_) |  __/ |
|_|  |_|\__, |____/ \__\_\_____| |_| |_|\___|_| .__/ \___|_|
        |___/                                 |_|

https://github.com/yingzhuo/mysql-helper
*/
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
        if (log.isInfoEnabled()) {
            log.info("DATASOURCE: host: {}", host);
            log.info("DATASOURCE: port: {}", port);
            log.info("DATASOURCE: username: {}", username);
            log.info("DATASOURCE: password: {}", password);
        }
    }

}
