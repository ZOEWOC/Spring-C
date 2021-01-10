package com.zoewoc.ba02;

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
                '}';
    }
}
