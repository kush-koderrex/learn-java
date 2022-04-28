package com.company;

import java.sql.Driver;

class Base{

    Base(){
        System.out.println("IT is a Constructor");
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("Drived CLass Constructor");
    }
    public  int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class kush_code_contructors_inharitance {
    public static void main(String[] args) {
//        Base b= new Base();
//        b.setX(5);
//        System.out.println(b.getX());
        Derived d=new Derived();



    }
}
