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
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Set;

/**
 * @author 应卓
 */
@Slf4j
@Validated
@Component
@ConfigurationProperties(prefix = "mysql-helper.focus")
@Getter
@Setter
public class FocusOn implements InitializingBean, Serializable {

    @NotEmpty(message = "请配置 `mysql-helper.focus.databases` ")
    private Set<String> databases;

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info(StringUtils.repeat('~', 80));
        log.info("FOCUS ON: {}", StringUtils.join(databases, ", "));
        log.info(StringUtils.repeat('~', 80));
    }

}
