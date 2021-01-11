package com.zoewoc.ba05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//省略value
@Component("myStudent")

//不指定对象名称，由spring提供默认名称:类名首字母小写
//@Component
public class Student {

    /**
     * @Value:简单类型的属性赋值 属性：value是string类型的，表示简单类型的属性值
     * 位置：1.在属性定义的上面，无需set方法，推荐使用
     * 2.在set方法上面
     */
    @Value(value = "zhangsan")  //@Value("zhangsan")
    private String name;
    //    @Value(value = "23")
    private String age;

    /**
     * 引用类型
     *
     * @Autowired:spring框架提供的注解，实现引用类型的赋值。 srping中通过注解给引用类型赋值，使用的自动注入原理，支持byName，byType
     * @Autowired：默认使用的byType自动注入。 使用位置：1）在属性定义的上面，无需set方法，推荐使用
     * 2）在set方法上面
     * <p>
     * 如果不要使用byName方式，需要做的是：
     * 1）在属性上面使用@Autowired
     * 2）在属性上面加入@Qualifier(value="bean的id")：表示使用指定名称的bean完成赋值
     */
    //byName自动注入
    /**
     * 属性：required，是一个boolean类型的参数，默认为true
     * required=true:表示引用类型复制失败，程序报错，并终止执行
     * requirde=false：表示引用类型如果复制失败，程序正常执行，引用类型为null
      */
    @Autowired(required = false)
    @Qualifier(value = "mySchool")
    private School school;

    public Student() {
        System.out.println("无参构造方法执行！");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Value("30")
    public void setAge(String age) {
        System.out.println("set方法执行！");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", school=" + school +
                '}';
    }
}
