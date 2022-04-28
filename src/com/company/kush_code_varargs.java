package com.company;

public class kush_code_varargs {
    static int sum(int ...arr){
//        int []a;
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(sum());
        System.out.println(sum(4,5));
        System.out.println(sum(4,5,5));
        System.out.println(sum(4,5,8));

    }
}
