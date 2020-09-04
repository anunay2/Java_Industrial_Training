package com.stackroute.strings;

public class LongestSubString{
    //write logic to find the longest substring that appears at both ends of a given string and return result
    public StringBuilder findLongestSubString(StringBuilder input) {
        int l=0,h=input.length();
        //String input1=input.toString();

        if(input.length()==0){
            return new StringBuilder("Give proper input");
        }
        else{
            StringBuilder temp1=new StringBuilder() ;
            StringBuilder temp= new StringBuilder();
            for(int i=0;i<h;i++){
                temp=temp.append(input.charAt(i));
                int len=0;
                for(int j=h-temp.length();j<h && j>=i;j++){
                    if(len<temp.length() && temp.charAt(len)==input.charAt(j)){
                        len++;
                    }
                    else{
                        break;
                    }
                }
                if(len==temp.length()) {
                    temp1 = new StringBuilder(temp);
                }
            }
            if(temp1.length()==0){
                return new StringBuilder("Longest substring is not present in the given StringBuilder");
            }
            else{
                return temp1;
            }
        }
    }
}
