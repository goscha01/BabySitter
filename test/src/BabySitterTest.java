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


}
