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
        if(totalTime>=0) {
            return totalTime;
        }
        else{
            return 0;
    }


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

    public int totalFamalyRateTimeCalculation(int earlyRate, int betweenRate, int lateRate, String earleRateLimit, String lateRateLimit) {
        TimeFrame timeFrame = new TimeFrame();
        return timeFrame.earlyRateTime(earleRateLimit)* earlyRate +
                timeFrame.lateRateTime(lateRateLimit)* lateRate +
                timeFrame.BetwenRateTime(earleRateLimit, lateRateLimit) * betweenRate;
    }

    public int earlyRateEarning(String start, String finish, Family family) {
        TimeFrame timeFrame = new TimeFrame();
        int earlyErning = timeFrame.earlyRateTimeNewArrayClass (start, finish, family)* family.earlyRate;
        return earlyErning;
    }

    public int lateRateEarning(String start, String finish, Family family) {
        TimeFrame timeFrame = new TimeFrame();
        int lateErning = timeFrame.lateRateTimeNewArrayClass (start, finish, family)* family.lateRate;
        return lateErning;
    }

    public int betweenRateEarning(String start, String finish, Family family) {
        TimeFrame timeFrame = new TimeFrame();
        int betweenErning = timeFrame.betwenRateTimeNewArrayClass(start, finish, family )* family.betweenRate;
        return betweenErning;
    }

    public int TotalEarning(String start, String finish, Family family) {
        BabySitter babySitter = new BabySitter();
        int totalEarning = babySitter.earlyRateEarning(start, finish, family)+
                babySitter.betweenRateEarning(start, finish, family)+
                babySitter.lateRateEarning(start, finish, family);
        return totalEarning;
    }




    /*public int earlyRateTimeCalculationInputFromConstructor(Family family, String start, String finish) {
        TimeFrame timeFrame = new TimeFrame();
        return timeFrame.earlyRateTimeNewArray(earlyRateLimit)* family.earlyRate;
    }*/

}
