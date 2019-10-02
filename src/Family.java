public class Family {

    int earlyRate;
    int betweenRate;
    int lateRate;
    String earlyRateLimit;
    String lateRateLimit;

    Family(){
    }

    Family (int earlyRate, int betweenRate, int lateRate,String earlyRateLimit, String lateRateLimit){
        this.earlyRate = earlyRate;
        this.betweenRate = betweenRate;
        this.lateRate = lateRate;
        this.earlyRateLimit = earlyRateLimit;
        this.lateRateLimit = lateRateLimit;
    }
}
