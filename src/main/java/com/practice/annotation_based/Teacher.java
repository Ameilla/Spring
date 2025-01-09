package com.practice.annotation_based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher {


@Autowired
private Student student;

    public Teacher(Student student) {
    }
//Field injection using Constructor
//    public Teacher(Student student) {
//        this.student = student;
//    }

    @Override
    public String toString() {
        return "Teacher{" +
                "student=" + student +
                '}';
    }
}
