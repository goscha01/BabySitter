import org.junit.Test;
import javax.swing.*;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertArrayEquals;

public class BabySitterTest {

    @Test
    public void whenPassAStringArrayIndexReturnsANumberOfStart(){
        TimeFrame timeFrame = new TimeFrame ();
        assertEquals(1, timeFrame.startTimeStr("5PM"));
        assertEquals(2, timeFrame.startTimeStr("6PM"));
        assertEquals(12, timeFrame.startTimeStr("4AM"));
    }

    @Test
    public void whenPassAStringArrayIndexReturnsANumberOfFinish(){
        TimeFrame timeFrame = new TimeFrame ();
        assertEquals(3, timeFrame.finishTimeStr("7PM"));
        assertEquals(12, timeFrame.finishTimeStr("4AM"));
    }

     @Test
    public void whenPassStartAndFinishTimeReturnsNewArrayStringCheckArray(){
        TimeFrame timeFrame = new TimeFrame();
        String [] expected = new String [] {"6PM", "7PM", "8PM", "9PM", "10PM", "11PM", "12AM", "1AM", "2AM"};
        String [] expected2 = new String [] {"5PM", "6PM", "7PM", "8PM", "9PM", "10PM", "11PM", "12AM", "1AM", "2AM"};
        String [] expected3 = new String [] {"5PM"};
        String [] expected4 = new String [] { "4AM"};
        String [] expected5 = new String [] { "4AM"};
        assertArrayEquals(expected, timeFrame.newArrayReturn("6PM", "2AM") );
        assertArrayEquals(expected2, timeFrame.newArrayReturn("5PM", "2AM") );
        assertArrayEquals(expected3, timeFrame.newArrayReturn("5PM", "5PM") );
        assertArrayEquals(expected4, timeFrame.newArrayReturn("4AM", "4AM") );
        assertArrayEquals(expected5, timeFrame.newArrayReturn("5AM", "4AM") );
    }

    @Test
    public void whenCreatingNewFamalyInstanceConstructorItHasAppropriateAttributes(){
        Family family = new Family(1,2,3,"6PM","2AM");
       // int earlyRate = family.earlyRate;
        assertEquals(1,  family.earlyRate);
        assertEquals(2,  family.betweenRate);
        assertEquals(3,  family.lateRate);
        assertEquals("6PM",  family.earlyRateLimit);
        assertEquals("2AM",  family.lateRateLimit);
    }

    @Test
    public void whenPassAnFamilyInstanceNewArrayValuesCalculatesBetweenTimeRate() {
        Family family = new Family(1,2,3,"6PM","2AM");
        Family family2 = new Family(1,2,3,"5PM","1AM");
        Family family3 = new Family(1,2,3,"5PM","5PM");
        Family family4 = new Family(1,2,3,"2AM","2AM");
        Family family5 = new Family(1,2,3,"5PM","3AM");
        TimeFrame timeFrame = new TimeFrame();
        assertEquals(8, timeFrame.betwenRateTimeNewArrayClass("6PM","2AM",family));
        assertEquals(7, timeFrame.betwenRateTimeNewArrayClass("6PM","2AM",family2));
        assertEquals(0, timeFrame.betwenRateTimeNewArrayClass("6PM","2AM",family3));
        assertEquals(0, timeFrame.betwenRateTimeNewArrayClass("6PM","2AM",family4));
        assertEquals(8, timeFrame.betwenRateTimeNewArrayClass("6PM","2AM",family5));
    }

    @Test
    public void whenPassAnFamilyInstanceNewArrayValuesCalculatesEarlyTimeRate() {
        Family family = new Family(1,2,3,"6PM","2AM");
        Family family2 = new Family(1,2,3,"5PM","1AM");
        Family family3 = new Family(1,2,3,"7PM","5PM");
        Family family4 = new Family(1,2,3,"2AM","2AM");
        Family family5 = new Family(1,2,3,"1AM","3AM");
        TimeFrame timeFrame = new TimeFrame();
        assertEquals(0, timeFrame.earlyRateTimeNewArrayClass("6PM","2AM",family));
        assertEquals(0, timeFrame.earlyRateTimeNewArrayClass("6PM","2AM",family2));
        assertEquals(1, timeFrame.earlyRateTimeNewArrayClass("6PM","2AM",family3));
        assertEquals(8, timeFrame.earlyRateTimeNewArrayClass("6PM","2AM",family4));
        assertEquals(7, timeFrame.earlyRateTimeNewArrayClass("6PM","2AM",family5));
    }

    @Test
    public void whenPassAnFamilyInstanceNewArrayValuesCalculatesLateTimeRate() {
        Family family = new Family(1, 2, 3, "6PM", "6PM");
        Family family2 = new Family(1, 2, 3, "5PM", "2AM");
        Family family3 = new Family(1, 2, 3, "7PM", "10PM");
        Family family4 = new Family(1, 2, 3, "2AM", "4AM");
        Family family5 = new Family(1, 2, 3, "1AM", "5PM");
        TimeFrame timeFrame = new TimeFrame();
        assertEquals(8, timeFrame.lateRateTimeNewArrayClass("6PM", "2AM", family));
        assertEquals(0, timeFrame.lateRateTimeNewArrayClass("6PM", "2AM", family2));
        assertEquals(4, timeFrame.lateRateTimeNewArrayClass("6PM", "2AM", family3));
       // assertEquals(java.lang.NegativeArraySizeException, timeFrame.lateRateTimeNewArrayClass("6PM", "2AM", family4));
        assertEquals(8, timeFrame.lateRateTimeNewArrayClass("6PM", "2AM", family5));
    }

    @Test
    public void whenPassAStartAFinishnAndFamilyCalculatesTotalBabySitterEarnings(){
        Family family = new Family(1,2,3,"6PM","2AM");
        Family family2 = new Family(1,2,3,"5PM","1AM");
        Family family3 = new Family(1,2,3,"5PM","5PM");
        Family family4 = new Family(1,2,3,"2AM","2AM");
        Family family5 = new Family(1,2,3,"5PM","3AM");
        BabySitter babySitter = new BabySitter();
        assertEquals(16, babySitter.TotalEarning("6PM","2AM",family));
        assertEquals(17, babySitter.TotalEarning("6PM","2AM",family2));
        assertEquals(24, babySitter.TotalEarning("6PM","2AM",family3));
        assertEquals(8, babySitter.TotalEarning("6PM","2AM",family4));
        assertEquals(16, babySitter.TotalEarning("6PM","2AM",family5));
    }

    @Test
    public void whenProgramRunsGUIAppiers () {
        GUI frame = new GUI();
        assertNotNull(frame);
        JPanel panel = new JPanel();
        assertNotNull(panel);
        JLabel startlbl = new JLabel();
        assertNotNull(startlbl);
        JComboBox startcb = new JComboBox();
        assertNotNull(startcb);
        JLabel finishlbl = new JLabel();
        assertNotNull(finishlbl);
        JComboBox finishcb = new JComboBox();
        assertNotNull(finishcb);
        JLabel familylbl = new JLabel();
        assertNotNull(familylbl);
        JRadioButton familyrb1 = new JRadioButton();
        assertNotNull(familyrb1);
        JRadioButton familyrb2 = new JRadioButton();
        assertNotNull(familyrb2);
        JRadioButton familyrb3 = new JRadioButton();
        assertNotNull(familyrb3);
        JButton btn = new JButton();
        assertNotNull(btn);
    }

}
