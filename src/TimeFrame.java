import javax.swing.*;

public class TimeFrame {

    public static final String[] TIME_SPAN_STR = new String[]{"5PM", "6PM", "7PM", "8PM", "9PM", "10PM", "11PM",
    "12AM", "1AM", "2AM", "3AM", "4AM"};

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

    public String [] newArrayReturn (String start, String finish) {
        TimeFrame timeFrame = new TimeFrame();
        if (timeFrame.finishTimeStr(finish) < timeFrame.startTimeStr(start)){
                    JOptionPane.showMessageDialog(null,
                    "Your  finish time must be later than your start time!!!",
                    "Wrong Entry",
                    JOptionPane.WARNING_MESSAGE);
            throw new NegativeArraySizeException("Wrong entry");
                    }

        int arrayLenght = timeFrame.finishTimeStr(finish) - timeFrame.startTimeStr(start) + 1;
        String[] timeArray = new String[arrayLenght];
        int i=0;
        int j = startTimeStr(start)-1;
        while (i<arrayLenght) {
            timeArray [i] = TIME_SPAN_STR [j];
            i+=1; j+=1;
        }
        return timeArray;
    }

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

    public int betwenRateTimeNewArrayClass(String start, String finish, Family family) {
        String[] baseTimeArray = newArrayReturn(start, finish);
        int result = baseTimeArray.length -1 - earlyRateTimeNewArrayClass(start, finish, family) - lateRateTimeNewArrayClass( start,  finish, family);
        return result;
    }

}
