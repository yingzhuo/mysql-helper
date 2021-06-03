/*

 __  __       ____   ___  _       _   _      _
|  \/  |_   _/ ___| / _ \| |     | | | | ___| |_ __   ___ _ __
| |\/| | | | \___ \| | | | |     | |_| |/ _ \ | '_ \ / _ \ '__|
| |  | | |_| |___) | |_| | |___  |  _  |  __/ | |_) |  __/ |
|_|  |_|\__, |____/ \__\_\_____| |_| |_|\___|_| .__/ \___|_|
        |___/                                 |_|

https://github.com/yingzhuo/mysql-helper
*/
package com.github.yingzhuo.mysqlhelper;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@MapperScan(
        annotationClass = Mapper.class,
        basePackages = StringPool.BASE_PACKAGE
)
@EnableTransactionManagement
class ApplicationBootJdbc {

    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}
