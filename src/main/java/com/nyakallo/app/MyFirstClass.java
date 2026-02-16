package com.nyakallo.app;

import org.springframework.stereotype.Component;


public class MyFirstClass {

    private String myVar;

    public MyFirstClass(String myVar){
        this.myVar = myVar;

    }

    public String sayHello() {
        return "Hello from Myfirst class ==> myVar = " + myVar;
    }
}
