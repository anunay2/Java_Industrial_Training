package com.stackroute.basics;

import java.util.Scanner;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    static Scanner input= new Scanner(System.in);
    String str;
    public static void main(String[] args){

        //call the functions in the required sequence
        new PhoneNumberValidator().getInput();
    }

    public String getInput() {
        String str = input.next();
        validatePhoneNumber(str);
        return null;
    }

    public void displayResult(int result) {
        //displays the result
        if(result==-1){
            //System.out.println("Empty");
        }
        else if(result==0){
            //System.out.println("Invalid");
        }
        else{
            //System.out.println("Valid");
        }
    }

    public int validatePhoneNumber(String input) {
        if(input=="" || input==null){
            displayResult(-1);
            return -1;
        }
        else{
            int digit=0;
            for(int i=0;i<input.length();i++){
                if(input.charAt(i)=='-'){
                    continue;
                }
                else if(input.charAt(i)>='0' && input.charAt(i)<='9'){
                    digit++;
                    continue;
                }
                else{
                    displayResult(0);
                    return 0;
                }
            }
            if(digit==10){
                displayResult(1);
                return 1;
            }
            else{
                displayResult(0);
                return 0;
            }
        }
        //return 0;
    }
    public void closeScanner(){
        input.close();
        //close the Scanner object
    }
}
