package main.java;

import javax.swing.*;

public class TimeFrame {
//Declares a possible time points
    public static final String[] TIME_SPAN_STR = new String[]{"5PM", "6PM", "7PM", "8PM", "9PM", "10PM", "11PM",
    "12AM", "1AM", "2AM", "3AM", "4AM"};

//Finds an index for a start time
    public int startTimeStr(String start) {
        int j=0;
        while (j< TIME_SPAN_STR.length){
            if (TIME_SPAN_STR[j] == start) {
                return  j+1;
            }
            else{
                j+=1;
            }
        }
        return j;
    }

    //Finds an index for a finish time
    public int finishTimeStr(String finish) {
        int j=0;
        while (j<TIME_SPAN_STR.length){
            if (TIME_SPAN_STR[j] == finish) {
                return  j+1;
            }
            else{
                j+=1;
            }
        }
        return j;
    }

    //Calculates total babysitting time
    public int timeCalculationStr(String start, String finish) {
        TimeFrame timeFrame = new TimeFrame();
        int startTime = timeFrame.startTimeStr(start);
        int finishTime = timeFrame.finishTimeStr(finish);
        int totalTime = finishTime - startTime;
        if(totalTime>=0) {
            return totalTime;
        }
        else{
            return 0;
        }
    }

    //Returns a string array of values during the babysitting time
    public String [] newArrayReturn (String start, String finish) {
        TimeFrame timeFrame = new TimeFrame();
        int arrayLenght = timeFrame.timeCalculationStr(start, finish)+1;
        String[] timeArray = new String[arrayLenght];
        int i=0;
        int j = startTimeStr(start)-1;
        while (i<arrayLenght) {
            timeArray [i] = TIME_SPAN_STR [j];
            i+=1; j+=1;
        }
        return timeArray;
    }

        //Calculates ammount of time for the early price rate
    public int earlyRateTimeNewArrayClass(String start, String finish, Family family) {
        String  earlyRateLimit = family.earlyRateLimit;
        String[] baseTimeArray = newArrayReturn(start, finish);
        String[] newArray = newArrayReturn(baseTimeArray[0], earlyRateLimit);
        if (newArray.length>0) {
            if (newArray.length<=baseTimeArray.length) {
                return newArray.length-1;
            }
            else {
                return baseTimeArray.length-1;
            }
        } else {
            return 0;
        }
    }

    //Calculates ammount of time for the late price rate
    public int lateRateTimeNewArrayClass(String start, String finish, Family family) {
        String  lateRateLimit = family.lateRateLimit;
        String[] baseTimeArray = newArrayReturn(start, finish);
        String[] newArray = newArrayReturn(lateRateLimit, baseTimeArray[baseTimeArray.length-1]);
        if (newArray.length>0) {
            if (newArray.length<=baseTimeArray.length) {
                return newArray.length-1;
            } else {
                return baseTimeArray.length-1;
            }
        } else {
            return 0;
        }
    }

    //Calculates ammount of time for the  middle(between) price rate
    public int betwenRateTimeNewArrayClass(String start, String finish, Family family) {
        String[] baseTimeArray = newArrayReturn(start, finish);
        int result = baseTimeArray.length -1 -
                earlyRateTimeNewArrayClass(start, finish, family) -
                lateRateTimeNewArrayClass( start,  finish, family);
        return result;
    }

}
