package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JndiConnectionFactoryAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableAutoConfiguration(exclude = {JndiConnectionFactoryAutoConfiguration.class,DataSourceAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class,JpaRepositoriesAutoConfiguration.class,DataSourceTransactionManagerAutoConfiguration.class})

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

}
@RestController
 class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello, world";
	}}