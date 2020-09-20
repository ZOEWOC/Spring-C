package com.zoewoc.service.impl;

import com.zoewoc.service.SomeService;

public class SomeServiceImpl implements SomeService {
   public SomeServiceImpl(){
        System.out.println("someServiceImpl 无参构造方法");
    }
    
    @Override
    public void doSome() {
        System.out.println("执行了SomeServiceImpl的doSome方法！");
    }
}
