package main.java;

public class Family {

    //Declares variables of Family classes
    public int earlyRate;
    public int betweenRate;
    public int lateRate;
    public String earlyRateLimit;
    public String lateRateLimit;

    //Default constructor
    Family(){
    }

    //Constructor of Family class
    public Family(int earlyRate, int betweenRate, int lateRate, String earlyRateLimit, String lateRateLimit){
        this.earlyRate = earlyRate;
        this.betweenRate = betweenRate;
        this.lateRate = lateRate;
        this.earlyRateLimit = earlyRateLimit;
        this.lateRateLimit = lateRateLimit;
    }
}
