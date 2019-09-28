import java.util.Arrays;

public class TimeFrame {

    public static final String[] TIME_SPAN_STR = new String[]{"5PM", "6PM", "7PM", "8PM", "9PM", "10PM", "11PM",
    "12AM", "1AM", "2AM", "3AM", "4AM"};

    public int intoInteger(String inputStart) {
        return Integer.parseInt(inputStart);
    }

    public int startTime(int i) {
        int [] timeSpan = {1,2,3,4};
        int j=0;
        int index;
        while (j<timeSpan.length-1){
            if (timeSpan[j] == i) {
                return  j+1;
            }
            else{
                j+=1;
            }
        }
        return j;

    }

    public int startTimeStr(String start) {
        int j=0;
        int index;
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

    public int finishTimeStr(String finish) {
        int j=0;
        int index;
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

    public int earlyRateTime(String earlyRateLimit) {
        int j=0;
        while (j<TIME_SPAN_STR.length-1){
            if (TIME_SPAN_STR[j] == earlyRateLimit) {
                if (j>0){
                    return j;
                }
                else{
                    return  0;
                }
            }
            else{
                j+=1;
            }

        }
        return j;
    }

    public int lateRateTime(String lateRateLimit) {
        int j=0;
        while (j<=TIME_SPAN_STR.length-1){
            if (TIME_SPAN_STR[j] == lateRateLimit) {
                if (j<0){
                    return 0;
                }
                else{

                    return TIME_SPAN_STR.length -1  - j;
                }
            }
            else{
                j+=1;
            }

        }
        return j;
    }

    public int BetwenRateTime(String earlyRateLimit, String lateRateLimit) {
        return TIME_SPAN_STR.length-1 - lateRateTime(lateRateLimit)-earlyRateTime(earlyRateLimit);
    }

    public int calculateAllTime(String earlyRateLimit, String lateRateLimit) {
        return earlyRateTime(earlyRateLimit) + lateRateTime(lateRateLimit) + BetwenRateTime(earlyRateLimit, lateRateLimit);
}

    public int calculateAllTimeMltRate(int rate, String earlyRateLimit, String lateRateLimit) {
        return earlyRateTime(earlyRateLimit)*rate + lateRateTime(lateRateLimit)*rate + BetwenRateTime(earlyRateLimit, lateRateLimit)*rate;

    }

    public void totalCalculatedTime(String start, String finish) {

    }

    public int newArray(String start, String finish) {
        BabySitter babySitter = new BabySitter();
        int arrayLenght = babySitter.timeCalculationStr(start, finish);
        int j = startTimeStr(start);
        String timeArray [] = new String [arrayLenght];
        int i=0;
        while (j<arrayLenght){
            timeArray [i] = TIME_SPAN_STR [j];
            i+=1;
            j+=1;

        }
        return timeArray.length;

    }


    public String newArrayString (String start, String finish) {
        BabySitter babySitter = new BabySitter();
        int arrayLenght = babySitter.timeCalculationStr(start, finish)+1;
        String timeArray [] = new String [arrayLenght];
        int i=0;
        int j = startTimeStr(start)-1;
        while (i<arrayLenght) {
            timeArray [i] = TIME_SPAN_STR [j];
            i+=1; j+=1;
        };

         return Arrays.toString (timeArray);
    }

    public String [] newArrayReturn (String start, String finish) {
        BabySitter babySitter = new BabySitter();
        int arrayLenght = babySitter.timeCalculationStr(start, finish)+1;
        String timeArray [] = new String [arrayLenght];
        int i=0;
        int j = startTimeStr(start)-1;
        while (i<arrayLenght) {
            timeArray [i] = TIME_SPAN_STR [j];
            i+=1; j+=1;
        };
       return timeArray;
    }




   public int NewEarlyArrayLenght (String earlyRateLimit) {
        String [] newArray = newArrayReturn (TIME_SPAN_STR[0],earlyRateLimit);
        return newArray.length;
    }


    public int earlyRateTimeNewArray(String earlyRateLimit) {
        return NewEarlyArrayLenght(earlyRateLimit)-1;
    }

    public int NewLateArrayLenght (String lateRateLimit) {
        String [] newArray = newArrayReturn (lateRateLimit, TIME_SPAN_STR[TIME_SPAN_STR.length - 1]);
        return newArray.length;

    }
    public int lateRateTimeNewArray(String lateRateLimit) {
        return NewLateArrayLenght(lateRateLimit)-1;
    }

}
