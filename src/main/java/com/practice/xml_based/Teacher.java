package com.practice.xml_based;

public class Teacher {
    private Student student;

    public Teacher() {
    }
//Field injection using Constructor
    public Teacher(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "student=" + student +
                '}';
    }
}
