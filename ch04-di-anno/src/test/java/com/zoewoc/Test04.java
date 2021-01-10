package com.zoewoc;

import com.zoewoc.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        Student student=(Student)applicationContext.getBean("myStudent");
        System.out.println("Student:"+student);
    }
}
