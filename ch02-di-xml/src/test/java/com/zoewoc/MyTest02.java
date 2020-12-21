package com.zoewoc;

import com.zoewoc.ba02.School;
import com.zoewoc.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {

    @Test
    public void test02() {
        System.out.println("==test02==");

        Student student=new Student();
        student.setName("lsc");
        student.setAge(22);

        School school=new School();
        school.setName("zoewoc");
        school.setAddress("536");
        student.setSchool(school);

        System.out.println("student==="+student);
    }

    @Test
    public void test01() {
        String config = "ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("myStudent");
        System.out.println("student对象：" + student);
    }
}
