import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

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
    }

    @Test
    public void whenPassAStringArrayIndexReturnsANumberOfFinish(){
        TimeFrame timeFrame = new TimeFrame ();
        assertEquals(3, timeFrame.finishTimeStr("7PM"));
    }

    @Test
    public void whenPassStartTimeAndFinishTimeStringsReturnsDifferanceNumber (){
        BabySitter babySitter = new BabySitter();
        assertEquals(5, babySitter.timeCalculationStr("5PM","10PM"));
    }

    @Test
    public void whenPassAnIndexCalculateTotalTimeBeforeIt(){
        TimeFrame timeFrame = new TimeFrame();
        assertEquals(5, timeFrame.earlyRateTime("11PM"));
        //assertEquals(5, timeFrame.earlyRateTime(7));
        //assertEquals(5, timeFrame.earlyRateTime(7));
    }



}
