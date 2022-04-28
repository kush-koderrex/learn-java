package com.company;

public class kush_code_recurrsion {
    static int fac(int a){
//        int fact;
        if (a==0){
            return 1;
        }
        else {
            return a*fac(a-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(fac(4));

    }
}
