package com.stackroute.exercises;


public class StringParse {
    //Write logic to find the character from the sentence at specified location
    public char characterLocator(String sentence, String location) {

        try{
            Integer i= Integer.parseInt(location);
            try{
                char c= sentence.charAt(i);
                return c;
            }
            catch(StringIndexOutOfBoundsException e){
                throw e;
            }
        }
        catch(NumberFormatException e){
            throw e;
        }

    }
}
