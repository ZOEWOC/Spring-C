package com.zoewoc;

import com.zoewoc.service.SomeService;
import com.zoewoc.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01() {
        SomeService someService = new SomeServiceImpl();
        someService.doSome();
    }

    /*
        spring吗默认创建对象的时间是：在创建spring的容器时，会创建配置文件中的所有对象
        spring 创建对象默认使用的是无参构造方法
     */
    @Test
    public void test02() {
        //使用spring容器创建的对象
        //1.指定spring配置文件的名称
        String config = "beans.xml";
        //2.创建标识spring容器的对象，ApplicationContext
        //ClassPathXmlApplicateionContext；表示从类路径中加载spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //从容器中获取某个对象，调用方法
        //getbean(“配置 文件中的bean的id值”)
        SomeService service = (SomeService) ac.getBean("someService");
        //使用spring创建好的对象
        service.doSome();
    }

    /**
     * 获取spring容器中的java对象信息
     */
    @Test
    public void test03() {
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //使用spring提供的方法，获取容器中定义的对象的数量
        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象数量："+nums);
        //容器中每个定义的对象的名称
        String names[] = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }


    }
}
