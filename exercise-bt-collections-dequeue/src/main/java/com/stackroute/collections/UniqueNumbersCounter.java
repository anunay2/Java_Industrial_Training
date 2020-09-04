package com.stackroute.collections;

import java.util.*;

public class UniqueNumbersCounter {
    //write logic to find maximum unique numbers count from given array in the sub array of certain length
    public String findUniqueNumbersCount(int[] inputArray, int k){
        if(inputArray==null){
            return "Give proper input not null array";
        }
        else if(inputArray.length==0){
            return "Give proper input not empty array";
        }
        else if(k>inputArray.length){
           return  "Give proper input, sub array length exceeds array length";
        }
        else if(k<=0){
            return "Give proper input, sub array length can not be negative or zero";
        }
        int max=-1;
        for(int i=0;i<inputArray.length;i++){
            Set<Integer> s1=new HashSet();
            for(int j=i;j<inputArray.length && j<i+k;j++){
                s1.add(inputArray[j]);
            }
            max=max>s1.size()?max:s1.size();
        }
        return "Count of Unique Numbers is "+String.valueOf(max);
    }
}
