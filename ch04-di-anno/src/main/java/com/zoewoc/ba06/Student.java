package com.zoewoc.ba06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


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
     * @Resource:来自jdk中的注解，spring框架提供了对这个注解的功能支持，可以使用它给引用类型赋值，使用的也是自动注入原理， 支持byName，byType，默认是byName
     * 位置：1.在属性定义的上面，无需set方法，推荐使用
     * 2.在set方法上面
     */
    //默认byName:先使用byName自动注入，如果byName复制失败，再使用byType
    @Resource
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
