package com.practice.annotation_based;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
//    insted of using @Value annotation you can create a config class and define the values
//    @Value("143")
    private int id;
//    @Value("Amar")
    private String name;



//Constructor Injection
//    public Student( @Value("143") int id,@Value("Amar") String name) {
//        this.id = id;
//        this.name = name;
//    }

// for the constructor values are coming from AppConfig
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
