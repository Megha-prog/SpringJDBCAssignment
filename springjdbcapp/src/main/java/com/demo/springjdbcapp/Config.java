package com.demo.springjdbcapp;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.demo.springjdbcapp")
public class Config {
	@Bean
	  public DataSource dataSource() {
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    //MySQL database we are using
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/axis");//change url
	    dataSource.setUsername("root");//change userid
	    dataSource.setPassword("12345");//change pwd
		return dataSource;
	    

}
	
	 @Bean
	  public JdbcTemplate jdbcTemplate() {
	    JdbcTemplate jdbcTemplate = new JdbcTemplate();
	    jdbcTemplate.setDataSource(dataSource());
	    return jdbcTemplate;
	  }
	 
	 
	@Bean

	  public WorkerDao workerdao(){
	    WorkerDao workerdao = new WorkerDao();
	    workerdao.setJdbcTemplate(jdbcTemplate());
	    return workerdao;
	  }
}