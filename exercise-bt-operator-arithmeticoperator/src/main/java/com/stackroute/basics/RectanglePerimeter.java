package com.stackroute.basics;


import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        new RectanglePerimeter().getValues();
    }

    //get user input from console
    public void getValues() {
        Scanner sc= new Scanner(System.in);
        double len,breadth;
        len=sc.nextDouble();
        breadth=sc.nextDouble();
        perimeterCalculator(len,breadth);

    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {
        double per=2.0*(length+breadth);
        System.out.println(per);
        return per;
        //return 0;
    }
}
