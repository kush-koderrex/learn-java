package com.company;

class employ{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }



}
public class kush_code_class_prac {
    public static void main(String[] args) {
        employ kush =new employ();
//        kush.setName("Kush");
        System.out.println(kush.getName());


    }
}
