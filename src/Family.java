public class Family {

    //Declares variables of Family classes
    int earlyRate;
    int betweenRate;
    int lateRate;
    String earlyRateLimit;
    String lateRateLimit;

    //Default constructor
    Family(){
    }

    //Constructor of Family class
    Family (int earlyRate, int betweenRate, int lateRate,String earlyRateLimit, String lateRateLimit){
        this.earlyRate = earlyRate;
        this.betweenRate = betweenRate;
        this.lateRate = lateRate;
        this.earlyRateLimit = earlyRateLimit;
        this.lateRateLimit = lateRateLimit;
    }
}
