package com.company;

import java.awt.*;

class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double SurfaceArea(){
        return 2*3.14 *radius*radius+2*3.14*radius*height;
    }
    public double Volume(){
        return 3.14 *radius*radius*height;
    }
    class Rectangle{
        private int length;
        private int breath;

        public Rectangle() {
            this.length = 4;
            this.breath = 5;
        }

        public Rectangle(int length, int breath) {
            this.length = length;
            this.breath = breath;
        }
    }

}

public class kush_code_excersise {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setRadius(4);
        myCylinder.setHeight(8);
        System.out.println(myCylinder.getHeight());
//        Problem 2
        System.out.println(myCylinder.SurfaceArea());
        System.out.println(myCylinder.Volume());


    }

}
