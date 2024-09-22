package com.mubeendev.main;

import com.mubeendev.beans.Employee;
import com.mubeendev.beans.Student;
import com.mubeendev.resources.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Employee employee = (Employee) context.getBean("employee");
        Student student = (Student) context.getBean("student");

        student.display();
        employee.display();
    }
}