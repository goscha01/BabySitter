public class Family {

    int earlyRate;
    int betweenRate;
    int lateRate;
    String earlyRateLimit;
    String lateRateLimit;

    Family (int earlyRate, int betweenRate, int lateRate,String earlyRateLimit, String lateRateLimit){
        this.earlyRate = earlyRate;
        this.betweenRate = betweenRate;
        this.lateRate = lateRate;
        this.earlyRateLimit = earlyRateLimit;
        this.lateRateLimit = lateRateLimit;
    }

    Family(){

    }

    public int rate(int rate){
            return rate;
        }

    public int [] rates(int earlyRate, int betweenRate, int lateRate) {
            int [] rateArray = {earlyRate, betweenRate, lateRate};
            return rateArray;
    }

    public String [] timeRates(String earlyRateLimit, String lateRateLimit) {
            String [] timeRateArray = {earlyRateLimit,lateRateLimit};
            return timeRateArray;

    }
}
