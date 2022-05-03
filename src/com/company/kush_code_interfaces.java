package com.company;

interface Bicycle {
    int a =45;
    void applyBreak(int decrement);
    void Speedup(int increment);
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("PEE POO");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
    public void Speedup(int increment){
        System.out.println("Appyling Speed up");
    }

}

public class kush_code_interfaces {
    public static void main(String[] args) {
        AvonCycle kushcycle = new AvonCycle();
        kushcycle.applyBreak(1);
        System.out.println(kushcycle.a);
    }
}
