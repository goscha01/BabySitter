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


}
