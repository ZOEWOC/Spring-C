package com.zoewoc;

import com.zoewoc.service.SomeService;
import com.zoewoc.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        SomeService someService=new SomeServiceImpl();
        someService.doSome();
    }


    @Test
    public void test02(){
        String config="beans.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        SomeService service=(SomeService) ac.getBean("someService");
        service.doSome();
    }

    /**
     * 获取spring容器中的java对象信息
     */
    @Test
    public void test03(){
        String config="beans.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        //使用spring提供的方法，获取容器中定义的对象的数量
        int nums=ac.getBeanDefinitionCount();
        //容器中每个定义的对象的名称
        String names []=ac.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }


    }
}
