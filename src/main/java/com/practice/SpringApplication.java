package com.practice;

import com.practice.annotation_based.AppConfig;
import com.practice.annotation_based.Student;
import com.practice.annotation_based.Teacher;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringApplication {

	public static void main(String[] args) {

		org.springframework.boot.SpringApplication.run(SpringApplication.class, args);

//		this is for the XML Based Configuration
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//		Student stu = (Student) context.getBean("stud");
//		System.out.println(stu);
//
//		Object student = context.getBean("stu");
//		System.out.println(student);
//
//		Teacher teacher = (Teacher) context.getBean("teacher");
//		System.out.println(teacher);


//		this is for the Annotation Based
//		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		Student student = context.getBean(Student.class);
//		System.out.println(student);
//
//		Teacher teacher = context.getBean(Teacher.class);
//		System.out.println(teacher);

	}

}
