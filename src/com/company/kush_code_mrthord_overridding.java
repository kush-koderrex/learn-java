package com.company;

class A{
    public  int a;
    public int kush(){
        return 4;
    }
    public void meth2(){
        System.out.println(" i am method two of class A");
    }
}
class B extends A{
    public void meth3(){
        System.out.println(" i am method 3 of class B");
    }

}
public class kush_code_mrthord_overridding{
    public static void main(String[] args) {
        A a =new A();
        a.meth2();


    }
}
