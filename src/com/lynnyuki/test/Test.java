package com.lynnyuki.test;

import com.lynnyuki.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //通常构造对象的方法
        Student student = new Student(1,"YangJun",25);
        System.out.println(student.toString());
        //载入配置文件,IOC构造对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student1 = (Student)context.getBean("Student");
        System.out.println(student1.toString());
    }
}
