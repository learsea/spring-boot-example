package com.midea.jr.ecf.channel.front.guide.dao;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DruidDBConfig {

	private Logger logger = LoggerFactory.getLogger( DruidDBConfig.class );

	@Bean // 声明其为Bean实例
	@Primary // 在同样的DataSource中，首先使用被标注的DataSource
	@ConfigurationProperties( prefix = "spring.datasource" )//自动注入前缀为spring.datasource的配置
	public DataSource dataSource() {
		DruidDataSource datasource = new DruidDataSource();
		return datasource;
	}
}