package com.firstapp.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
//    @Bean
//    public DataSource dataSource (){
//        DataSourceBuilder dsb = DataSourceBuilder.create();
//        dsb.url("jdbc:postgresql://localhost:5432/conference_app");
//        dsb.username("postgres");
//        dsb.password("Welcome");
//        System.out.println("My costom data source from PersistenceConfiguration class");
//        return dsb.build();
//    }
}
