package com.stackroute.collections;

//import java.lang.management.MonitorInfo;
import com.sun.jdi.event.MonitorContendedEnteredEvent;

import java.time.LocalDate;
import java.util.*;

/*
This class contains a property called movieMap of type Map
This class contains methods for adding key-value pairs of Movie and its rating to HashMap and
various methods for accessing the keys and values based on some conditions
 */

public class MovieService {

    /**
     * Constructor to create movieMap as an empty  LinkedHashMap object
     */
    Map<Movie,Integer> map;
    public MovieService(){
        map=new LinkedHashMap<>();
    }

    /*
    Returns the movieMap object
     */
    public Map<Movie, Integer> getMovieMap() {
        return map;
    }

    /*
    Add key-value pairs of Movie-Integer type and returns Set of Map.Entry
     */
    public Set<Map.Entry<Movie, Integer>> addKeyValuePairsToMap(Movie movie, Integer rating) {
        map.put(movie,rating);
        return map.entrySet();


    }

    /*
    Return Set of movie names having rating greater than or equal to given rating
     */
    public List<String> getHigherRatedMovieNames(int rating) {
        List< String> l1=new ArrayList<>();
        for(Map.Entry<Movie,Integer> e:map.entrySet()){
            if(e.getValue()>=rating){
                l1.add(e.getKey().getMovieName());
            }
        }

        return l1;
    }

    /*
    Return Set of movie names belonging to specific genre
     */
    public List<String> getMovieNamesOfSpecificGenre(String genre) {

        List< String> l1=new ArrayList<>();
        for(Map.Entry<Movie,Integer> e:map.entrySet()){
            if(e.getKey().getGenre().equals(genre)){
                l1.add(e.getKey().getMovieName());
            }
        }

        return l1;
    }

   /*
   Return Set of movie names which are released after Specific releaseDate and having rating less than or equal to 3
    */

    public List<String> getMovieNamesReleasedAfterSpecificDateAndRatingLesserThanThree(LocalDate releaseDate) {
        List< String> l1=new ArrayList<>();
        for(Map.Entry<Movie,Integer> e:map.entrySet()){
            if(e.getValue()<=3 && (e.getKey().getReleaseDate()).isAfter(releaseDate)){
                l1.add(e.getKey().getMovieName());
            }
        }

        return l1;
    }

    /*
    Return set of movies sorted by release dates in ascending order.
    Hint: Use TreeMap
     */
    public List<Movie> getSortedMovieListByReleaseDate() {
       List<Movie> list =new ArrayList<>();
       for(Map.Entry<Movie,Integer> e:map.entrySet()){
           list.add(e.getKey());
       }
       Collections.sort(list);
       return list;

    }


    /*
   Return set of movies sorted by rating.
   Hint: Use Comparator and LinkedHashMap
    */
    public Map<Movie, Integer> getSortedMovieListByRating(){
        RatingCompare ratingCompare=new RatingCompare();
        List<Map.Entry<Movie,Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list,ratingCompare);
        Map<Movie,Integer> m1=new LinkedHashMap<>();
        for(Map.Entry<Movie,Integer> it:list){
            //System.out.println(it.getValue());
            m1.put(it.getKey(),it.getValue());
        }
        System.out.println(m1);
        return m1;
    }
}
