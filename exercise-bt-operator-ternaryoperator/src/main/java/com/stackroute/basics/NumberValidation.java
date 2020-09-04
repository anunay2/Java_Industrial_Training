package com.stackroute.basics;

import java.math.BigInteger;
import java.util.Scanner;

public class NumberValidation {
    public static void main(String[] args) {
        new NumberValidation().inputValidator();
    }

    //write logic to get input from user and send it to numberValidator in BigInteger
    public void inputValidator(){
            Scanner in = new Scanner(System.in);
            BigInteger n=in.nextBigInteger();
            in.close();
            numberValidator(n);
    }

    //write logic to find even/odd and return string
    public String numberValidator(BigInteger number)
    {
        
        return null;
    }
}
