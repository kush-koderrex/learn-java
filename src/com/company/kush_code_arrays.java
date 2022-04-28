package com.company;

public class kush_code_arrays {
    public static void main(String[] args) {
        int [] marks= new int[5];
        marks[0]=100;
        marks[1]=3000;
        marks[2]=140;
        marks[3]=150;
        marks[4]=160;
//        marks[5]=100;
//        marks[6]=100;
//        System.out.println(marks.length);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Reverse");
        for (int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("For Each");
        for (int element:marks){
            System.out.println(element);
        }
    }
}
