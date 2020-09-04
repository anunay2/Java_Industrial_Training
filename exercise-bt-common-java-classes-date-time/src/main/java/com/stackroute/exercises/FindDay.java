package com.stackroute.exercises;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FindDay {

    //write logic to find day of the date and return result
    public String findDay(int month, int day, int year) {
        String s1=new String("Give month in range");
        String s2=new String("Give day in range");
        String s3=new String("Give year in range");
        String ans=new String();
        if(month<1 || month>12){
            ans=ans+s1;
        }
        if(day<1 || day>31){
            ans=ans+s2;
        }
        if(year<2000 || year>3000){
            ans=ans+s3;
        }
        if(ans.length()!=0){
            return ans;
        }
        else{
            String month1=new String(String.valueOf(month));
            String day1=new String(String.valueOf(day));
            if(month1.length()==1){
                month1="0"+month1;
            }
            if(day1.length()==1){
                day1="0"+day1;
            }

            ans=String.valueOf(year)+"-"+month1+"-"+day1;
            DayOfWeek dayOfWeek= LocalDate.parse(ans).getDayOfWeek();
            return String.valueOf(dayOfWeek);

        }


    }
}
