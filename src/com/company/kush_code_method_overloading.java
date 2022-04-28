package com.company;

public class kush_code_method_overloading {
    static void foo(){
        System.out.println("Good Morning");
    }
    static void foo(int a){
        System.out.println("Good Morning"+a);
    }
//    static void foo(){
//        System.out.println("Good Morning");
//    }
    static void change(int a){
        a=90;
    }
    static void change2(int []arr){
        arr[0]=90;
    }
    static void telljoke(){
        System.out.println("Joke");
    }

    public static void main(String[] args) {
//        telljoke();

//        int x=45;
//        change(x);
//        System.out.println(x);

//        int []marks={22,44,5,55,66};
//        change2(marks);
//        System.out.println(marks[0]);

//        method Overloading
        foo(3000);



    }
}
