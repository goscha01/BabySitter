import javax.swing.*;

public class BabySitter {
    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.guiBuilder();
    }

    public int TotalEarning(String start, String finish, Family family) {
        TimeFrame timeFrame = new TimeFrame();
        int totalEarning = timeFrame.earlyRateTimeNewArrayClass (start, finish, family)* family.earlyRate +
                timeFrame.lateRateTimeNewArrayClass (start, finish, family)* family.lateRate +
                timeFrame.betwenRateTimeNewArrayClass(start, finish, family )* family.betweenRate;
        return totalEarning;
    }

}
