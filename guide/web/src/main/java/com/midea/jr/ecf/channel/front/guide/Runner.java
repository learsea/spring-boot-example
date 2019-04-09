package com.midea.jr.ecf.channel.front.guide;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author csy
 * @description 启动类
 * @date 2018-4-19
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan( "com.midea.jr.ecf.channel.front.guide.dao" )
@ImportResource( { "classpath:dubbo/*.xml" } )
@ComponentScan("com.midea.jr.ecf.channel.front")
public class Runner {

	public static void main( String[] args ) {
		SpringApplication.run( Runner.class, args );
	}

}
