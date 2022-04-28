package com.company;

public class kush_code_method {


    int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }else {
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        kush_code_method obj =new kush_code_method();
        int a=6;
        int b=5;
        int c;
        c=obj.logic(a,b);
        System.out.println(c);


    }
}
