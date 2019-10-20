package main.java;

public class BabySitter {

    //Runs GUI
    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.guiBuilder();
    }

    //Calculates total earnings
    public int totalEarning(String start, String finish, Family family) {
        TimeFrame timeFrame = new TimeFrame();
        int totalEarning = timeFrame.earlyRateTimeNewArrayClass (start, finish, family)* family.earlyRate +
                timeFrame.lateRateTimeNewArrayClass (start, finish, family)* family.lateRate +
                timeFrame.betwenRateTimeNewArrayClass(start, finish, family )* family.betweenRate;
        return totalEarning;
    }
}
