package com.stackroute.basics;


import java.util.Scanner;

public class NumberAverage {

    public static void main(String[] args) {
        new NumberAverage().getArrayValues();
    }

    //get the values of the array from the user
    public void getArrayValues() {
        //System.out.println("Enter number of values:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] inputArray=new int[n];
        //System.out.println("Enter the values:");
        for(int i=0;i<n;i++){
            inputArray[i]=scanner.nextInt();
        }
        String output=findAverage(inputArray);
        System.out.println(output);
    }

    //write here logic to calculate the average an array
    public String findAverage(int[] inputArray) {
        if(inputArray==null || inputArray.length==0){
            return "Empty array";
        }
        int sum=0,flag=0;
        for(int element:inputArray){
            if(element<0){
                flag=1;
                break;
            }
            sum+=element;
        }
        if(flag==1)
        {
            return "Give proper positive integer values";
        }
        String avg=String.valueOf(sum/ inputArray.length);
        return "The average value is: "+avg;
    }
}