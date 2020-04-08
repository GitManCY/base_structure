package com.cy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cy.mapper")
public class BaseStructureApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseStructureApplication.class, args);
    }

}
