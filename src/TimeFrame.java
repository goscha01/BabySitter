public class TimeFrame {

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
        String [] timeSpanStr = {"4PM","5PM", "6PM", "7PM", "8PM"};
        int j=0;
        int index;
        while (j<timeSpanStr.length-1){
            if (timeSpanStr[j] == start) {
                return  j+1;
            }
            else{
                j+=1;
            }
        }
        return j;
    }
}
