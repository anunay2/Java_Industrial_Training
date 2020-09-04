package com.stackroute.exercises;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogSortedListSearch {
    public List<String> catalogList;

    //write here logic to get sorted Array List which is a global class variable
    public String catalogListSorter(List<String> unSortedCatalogList) {
        if (unSortedCatalogList == null) {
            return "The catalog list is null";
        }
        if (unSortedCatalogList.isEmpty()) {
            return "The catalog List is empty";
        }
        for (String element : unSortedCatalogList) {
            if (element == null || element.isEmpty() || element == " ") {
                return "The catalog List contains empty or null or blank space as a value";
            }
        }
        catalogList=new ArrayList<>(unSortedCatalogList);
        Collections.sort(catalogList);
       //atalogList = unSortedCatalogList.stream().sorted().collect(Collectors.toList());
        return String.valueOf(catalogList);
    }

    //write here logic to search the input value in sorted Array List
    public String catalogListSearcher(String value) {
        if (value == null || value.isEmpty() || value == " ")
            return "Input is not accepted";

        for (String element : catalogList) {
            if (element.equalsIgnoreCase(value)) {
                return "Found: " + element;
            }
        }
        return "Not Found";
    }
}