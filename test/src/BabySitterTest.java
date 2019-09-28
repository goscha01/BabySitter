import org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;

import static javax.swing.text.StyleConstants.Family;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class BabySitterTest {
    @Test

    public void whenPassANumberBabySitterReturnsANumber(){
        BabySitter babySitter = new BabySitter();
        assertEquals(1,babySitter.duration(1));
    }

    @Test

    public void whenPassANumberTwoBabySitterReturnsANumberTwo(){
        BabySitter babySitter = new BabySitter();
        assertEquals(2,babySitter.duration(2));
    }

    @Test
    public void whenPassPassAMultiplierOfThreeReturnsANamberMultipliedOnThree(){
        BabySitter babySitter = new BabySitter();
        assertEquals(3,babySitter.result(1));
        assertEquals(6,babySitter.result(2));
    }

    @Test
    public void whenPassTwoNumbersReturnsAMultiplication(){
        BabySitter babySitter = new BabySitter();
        assertEquals(3,babySitter.totalResult(1,3));
    }

    @Test
    public void whenPassStartTimeAndFinishTimeReturnsDifferance (){
        BabySitter babySitter = new BabySitter();
        assertEquals(5, babySitter.timeCalculation(5,10));
    }

    @Test
    public void whenPassStartTimeFinishTimeAndPriceReturnsTotalPrice(){
        BabySitter babySitter = new BabySitter();
        assertEquals(25, babySitter.totalResult(5,5));
    }

    @Test
    public void whenPassStartAsAStringItReturnsAsANumber(){
        TimeFrame timeFrame = new TimeFrame ();
        assertEquals(2, timeFrame.intoInteger("2"));
    }

    @Test
    public void whenPassAArrayIndexReturnsANumber(){
        TimeFrame timeFrame = new TimeFrame ();
        assertEquals(2, timeFrame.startTime(2));
    }

    @Test
    public void whenPassAStringArrayIndexReturnsANumberOfStart(){
        TimeFrame timeFrame = new TimeFrame ();
        assertEquals(1, timeFrame.startTimeStr("5PM"));
        assertEquals(2, timeFrame.startTimeStr("6PM"));
    }

    @Test
    public void whenPassAStringArrayIndexReturnsANumberOfFinish(){
        TimeFrame timeFrame = new TimeFrame ();
        assertEquals(3, timeFrame.finishTimeStr("7PM"));
        assertEquals(12, timeFrame.finishTimeStr("4AM"));
    }

    @Test
    public void whenPassStartTimeAndFinishTimeStringsReturnsDifferanceNumber (){
        BabySitter babySitter = new BabySitter();
        assertEquals(5, babySitter.timeCalculationStr("5PM","10PM"));
        assertEquals(8, babySitter.timeCalculationStr("6PM","2AM"));
        assertEquals(11, babySitter.timeCalculationStr("5PM","4AM"));
    }

    @Test
    public void whenPassAnArrayValueCalculatesTotalTimeBeforeIt(){
        TimeFrame timeFrame = new TimeFrame();
        assertEquals(6, timeFrame.earlyRateTime("11PM"));
        assertEquals(0, timeFrame.earlyRateTime("5PM"));
        assertEquals(11, timeFrame.earlyRateTime("4AM"));
    }

    @Test
    public void whenPassAnArrayValueCalculatesTotalTimeAfterIt(){
        TimeFrame timeFrame = new TimeFrame();
        assertEquals(5, timeFrame.lateRateTime("11PM"));
        assertEquals(11, timeFrame.lateRateTime("5PM"));
        assertEquals(0, timeFrame.lateRateTime("4AM"));
    }

    @Test
    public void whenPassTwoArrayValuesCalculatesTotalTimeBetweenThem(){
        TimeFrame timeFrame = new TimeFrame();
        assertEquals(5, timeFrame.BetwenRateTime("6PM", "11PM"));
        assertEquals(11, timeFrame.BetwenRateTime("5PM","4AM"));
        assertEquals(0, timeFrame.BetwenRateTime("4AM", "4AM"));
        assertEquals(0, timeFrame.BetwenRateTime("5PM", "5PM"));
    }

    @Test
    public void passAnEarlyRateFamilyReturnsEarlyRate(){
        Family family = new Family();
        assertEquals(1,family.rate(1));
    }

    @Test
    public void whenPassARateBabySitterCalculatesriceForEarlyRateTime(){
        BabySitter babySitter = new BabySitter();
        assertEquals(5,babySitter.rateTimeCalculation(5,"6PM"));
    }


    @Test
    public void whenAddAllTimeRatesReceive11() {
        TimeFrame timeFrame = new TimeFrame();
        assertEquals(11, timeFrame.calculateAllTime("6PM", "2AM"));
        assertEquals(11, timeFrame.calculateAllTime("6PM", "11PM"));
        assertEquals(11, timeFrame.calculateAllTime("5PM", "4AM"));
    }

    @Test
    public void whenAddAllTimeandMultiplyEachWith5Receive55(){
        TimeFrame timeFrame = new TimeFrame();
        assertEquals(55, timeFrame.calculateAllTimeMltRate(5,"6PM", "2AM"));
        assertEquals(55, timeFrame.calculateAllTimeMltRate(5,"6PM", "11PM"));
        assertEquals(55, timeFrame.calculateAllTimeMltRate(5,"5PM", "4AM"));
    }


    @Test
    public void whenPassThreeDifferantRatesBabySitterCalculatsASummOfMultiplications(){
        BabySitter babySitter = new BabySitter();
        assertEquals(70,babySitter.totalFamalyRateTimeCalculation(5,6,7,"6PM","11PM"));
    }

    @Test
    public void whenPassStartAndFinishTimeReturnsNewArrayAndItsLength(){
        TimeFrame timeFrame = new TimeFrame();
        assertEquals(8, timeFrame.newArray ("6PM","2AM"));

    }

    @Test
    public void whenPassStartAndFinishTimeReturnsNewArrayString() {
        TimeFrame timeFrame = new TimeFrame();
        assertEquals("[6PM, 7PM, 8PM, 9PM, 10PM, 11PM, 12AM, 1AM, 2AM]", timeFrame.newArrayString("6PM", "2AM"));
        assertEquals("[5PM, 6PM, 7PM, 8PM, 9PM, 10PM, 11PM, 12AM, 1AM, 2AM, 3AM]", timeFrame.newArrayString("5PM", "3AM"));
        assertEquals("[5PM, 6PM, 7PM, 8PM, 9PM, 10PM, 11PM, 12AM, 1AM, 2AM, 3AM, 4AM]", timeFrame.newArrayString("5PM", "4AM"));
    }


    @Test
    public void whenPassStartAndFinishTimeReturnsNewArrayStringCheckArray(){
        TimeFrame timeFrame = new TimeFrame();
        String [] expected = new String [] {"6PM", "7PM", "8PM", "9PM", "10PM", "11PM", "12AM", "1AM", "2AM"};
        String [] expected2 = new String [] {"5PM", "6PM", "7PM", "8PM", "9PM", "10PM", "11PM", "12AM", "1AM", "2AM"};
        assertArrayEquals(expected, timeFrame.newArrayReturn("6PM", "2AM") );
        assertArrayEquals(expected2, timeFrame.newArrayReturn("5PM", "2AM") );

    }


    @Test
    public void whenPassEarlyRateLimitReturnsAnAppropriateArrayLenght() {
        TimeFrame timeFrame = new TimeFrame();
        assertEquals(10, timeFrame.NewArrayLenght("2AM"));
        assertEquals(7, timeFrame.NewArrayLenght("11PM"));
        assertEquals(1, timeFrame.NewArrayLenght("5PM"));
        assertEquals(12, timeFrame.NewArrayLenght("4AM"));
    }

    @Test
    public void whenPassAnNewArrayValueCalculatesTotalTimeBeforeIt() {
        TimeFrame timeFrame = new TimeFrame();
        assertEquals(6, timeFrame.earlyRateTimeNewArray("11PM"));
        assertEquals(0, timeFrame.earlyRateTimeNewArray("5PM"));
        assertEquals(11, timeFrame.earlyRateTimeNewArray("4AM"));
    }





}
