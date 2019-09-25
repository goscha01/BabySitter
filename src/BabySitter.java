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

    public int rateTimeCalculation(int rate, String earleRateLimit) {
        TimeFrame timeFrame = new TimeFrame();
        return timeFrame.earlyRateTime(earleRateLimit)* rate;
       }

    public int totalRateTimeCalculation(int rate, String earleRateLimit, String lateRateLimit) {
        TimeFrame timeFrame = new TimeFrame();
        return timeFrame.earlyRateTime(earleRateLimit)* rate +
                timeFrame.lateRateTime(lateRateLimit)* rate +
                timeFrame.BetwenRateTime(earleRateLimit, lateRateLimit) * rate;
    }

}
