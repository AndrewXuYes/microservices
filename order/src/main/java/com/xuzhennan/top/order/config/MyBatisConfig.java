package com.xuzhennan.top.order.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement //开启事务
@MapperScan({"com.xuzhennan.top.order.mapper", "com.xuzhennan.top.order.dao"})
public class MyBatisConfig {
}
