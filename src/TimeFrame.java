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
}
