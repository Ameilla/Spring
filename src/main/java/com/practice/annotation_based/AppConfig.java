package com.practice.annotation_based;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.practice")    // Scans the specified package for @Component classes
public class AppConfig {
    @Bean
    public Student student(){
        return new Student(1432,"Amarilla");
    }

    @Bean Teacher teacher(){
        return new Teacher(student());
    }
}
