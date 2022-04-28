package com.company;
import java.util.Scanner;

public class kush_code_conditional {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        age=sc.nextInt();

        switch(age){
            case 18:
                System.out.println("Adult");
                break;
            case 50:
                System.out.println("Mature");
                break;

        }

//          int age =19;
//          if(age>18){
//              System.out.println("18+");
//          }
//          else {
//              System.out.println("Not 18+");
//          }
    }
}
