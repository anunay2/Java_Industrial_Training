package com.stackroute.strings;

import java.util.Arrays;

public class Anagram {
    public static String sortString(String s1){
        char tempArray[]=s1.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    //write logic to check given two phrases are anagrams or not and return result
    public String checkAnagrams(String phraseOne, String phraseTwo) {
        if(phraseOne.isEmpty() || phraseTwo.isEmpty() || phraseOne==null || phraseTwo==null){
            return "Give proper input not empty phrases";
        }
        String p1=sortString(phraseOne);
        String p2 = sortString(phraseTwo);
        if(p1.compareTo(p2)==0){
            return "Given phrases are anagrams";
        }
        else{
            return "Given phrases are not anagrams";
        }
    }
}
