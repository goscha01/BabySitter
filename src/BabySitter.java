public class BabySitter {

    int totalTime;


    public int duration(int totalTime) {
        return totalTime;
    }

    public int result(int cost) {
        return cost * 3;
    }

    public int totalResult(int totalTime, int cost) {
        return totalTime * cost;
    }

    public int timeCalculation(int startTime, int finishTime) {
        return totalTime = finishTime - startTime;
    }

    public int timeCalculationStr(String start, String finish) {
        TimeFrame timeFrame = new TimeFrame();
        int startTime = timeFrame.startTimeStr(start);
        int finishTime = timeFrame.finishTimeStr(finish);
        totalTime = finishTime - startTime;
        return totalTime;


    }
}
