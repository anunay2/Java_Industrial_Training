package com.stackroute.collections;

import java.util.Comparator;
import java.util.Map;

public class RatingCompare implements Comparator<Map.Entry<Movie,Integer>>{
    public int compare(Map.Entry<Movie,Integer> m1,Map.Entry<Movie,Integer> m2){
        return (m1.getValue()).compareTo(m2.getValue());
    }
}