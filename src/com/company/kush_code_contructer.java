package com.company;

class myem{
    private int id;
    private String name;

    public myem(){
        id = 45;
        name = "Your_Name-here";
    }

    public String getName(){
        return name;
    }
    public void setname(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id=i;
    }

    public int getId(){
        return id;
    }
}
public class kush_code_contructer {
    public static void main(String[] args) {
        myem kush = new myem();
//        kush.setname("Kush Sharma");
//        kush.setId(34);
        System.out.println(kush.getId());
        System.out.println(kush.getName());

    }
}
