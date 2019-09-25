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
}
