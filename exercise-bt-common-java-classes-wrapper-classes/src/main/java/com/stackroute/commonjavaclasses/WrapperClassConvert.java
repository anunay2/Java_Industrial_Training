package com.stackroute.commonjavaclasses;

public class WrapperClassConvert {

    //write logic to determine and convert given primitive type to its wrapper class and return result
    public Object convertToWrapper(Object input) {
        if(input==null || input instanceof String){
            return "Give proper primitive type as input";
        }
        else{
            return input;
        }
    }
}

