package com.stackroute.basics;

import java.util.Scanner;

public class Calculator {
    private static Scanner scan;

    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        new Calculator().getValues(scan);
    }

    //Get values and which operator from the menu
    public void getValues(Scanner scan) {
        int num1,num2,op;
        char choice;
        String result;
        do {
            //System.out.println("Enter the first number:");
            num1=scan.nextInt();
            //System.out.println("Enter the second number:");
            num2=scan.nextInt();
            /*System.out.println("Enter number beside the operation to perform: \n" +
                    " 1. Add \n" +
                    " 2. Subtract\n" +
                    " 3. Multiply\n" +
                    " 4. Divide");*/
            op=scan.nextInt();
            result=calculate(num1,num2,op);
            System.out.println("Do you want to try again(y/n)");
            String s=scan.next();
            choice=s.charAt(0);
        }while(choice=='y');
        System.out.println(result);
    }

    //perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue, int secondValue, int operator) {
        int res=0,flag=0;
        String op=null;
        switch (operator)
        {
            case 1:
                op="+";
                res=firstValue+secondValue;
                break;
            case 2:
                op="-";
                res=firstValue-secondValue;
                break;
            case 3:
                op="*";
                res=firstValue*secondValue;
                break;
            case 4:
                if(secondValue==0)
                {
                    //System.out.println("");
                    flag=1;
                    break;
                }
                op="/";
                res=firstValue/secondValue;
                break;
            default:
                //System.out.println("Entered wrong option "+operator);
                flag=2;
                break;
        }
        String s;
        if(flag==1)
        {
            s="The divider (secondValue) cannot be zero";
            return s;
        }
        if(flag==2)
        {
            s="Entered wrong option "+String.valueOf(operator);
            return s;
        }
        s=String.valueOf(firstValue)+" "+op+" "+String.valueOf(secondValue)+" = "+String.valueOf(res);
        return s;
    }
}
