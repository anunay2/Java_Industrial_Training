package com.stackroute.collections;

public class BinaryNumberGenerator {
    //write logic to find binary number from 1 to given input
    public String findBinaryNumbersSequence(int input) {
        if(input<=0){
            return "Give proper input not zero or negative";
        }
        else if(input>20){
            return "Give proper input not greater than 20";
        }
        String ans=Integer.toBinaryString(1);
        for(int i=2;i<=input;i++){
            ans=ans+" "+ Integer.toBinaryString(i);
        }
        return ans;
    }
}