package com.company;

class Employee{
    int id;
    String name;
}

public class kush_code_sutom_class
{
    public static void main(String[] args) {

        System.out.println("This is custom class");
        Employee kush =new Employee();
        kush.id=1;
        kush.name="Kush";
        System.out.println(kush.id);
        System.out.println(kush.name);

    }
}
