package com.company;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        System.out.println("Taking User Input");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number 1");
        int a= sc.nextInt();
        System.out.println("Enter The Number 2");
        int b= sc.nextInt();
        int sum =a+b;
        System.out.println(sum);


    }
}
