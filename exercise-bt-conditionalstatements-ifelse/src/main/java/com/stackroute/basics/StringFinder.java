package com.stackroute.basics;

import java.util.Scanner;

public class StringFinder {
    //Create Scanner object as instance variable
    static Scanner input=new Scanner(System.in);
    public  static void main(String[] args) {new StringFinder().getInput();

    }

    public  String getInput(){
        String res= input.nextLine();
        String s1=input.nextLine();
        String s2=input.nextLine();
        //Get three strings from the user
        findString(res,s1,s2);
        return null;
    }

    public  void  displayResult(int result) {
        if(result==1){
            System.out.println("Found as expected\n");
        }
        else if(result==0){
            System.out.println("Not found\n");
        }
        else if(result==-1){
            System.out.println("Empty string or null\n");
        }
        //displays the result
    }

    public  int findString(String searchString, String firstString, String secondString) {
        if(firstString==null || secondString==null || searchString==null || firstString.length()==0 || secondString.length()==0 || searchString.length()==0){
            //displayResult(-1);
            System.out.println("empty string or null");
            return -1;
        }
        else{
            //int st1=searchString.indexOf(firstString);
            int end1=searchString.lastIndexOf(firstString);
            int st2=-1;
            if(end1!=-1)
                st2=searchString.indexOf(secondString,end1+1);
            if(st2!=-1 && end1!=-1){
                System.out.println("Found as Expected");
                return 1;
            }
            else{
                System.out.println("Not Found");
                return 0;
            }
        }
    }

    public void closeScanner() {
        input.close();
    }
}
