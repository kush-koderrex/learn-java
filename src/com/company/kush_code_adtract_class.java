package com.company;

abstract class Parents1{
    public Parents1(){
        System.out.println("Mai Base Class Ka Cuntructor hoon");
    }
    public  void sayhHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child2 extends Parents1{
    public void greet(){
        System.out.println("Good Morning");
    }
}
public class kush_code_adtract_class {
    public static void main(String[] args) {

    }
}
