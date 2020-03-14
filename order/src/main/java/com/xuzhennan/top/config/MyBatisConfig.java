package com.xuzhennan.top.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement //开启事务
@MapperScan({"com.xuzhennan.top.mapper"})
public class MyBatisConfig {

}
