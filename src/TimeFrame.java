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
        while (j< TIME_SPAN_STR.length-1){
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
        while (j<TIME_SPAN_STR.length-1){
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
        int index = 0;
        while (j<TIME_SPAN_STR.length){
            if (TIME_SPAN_STR[j] == earlyRateLimit) {
                if (j>0){
                    return index = j;
                }
                else{
                    return index = 0;
                }
            }
            else{
                j+=1;
            }

        }
        return index;
    }
}
