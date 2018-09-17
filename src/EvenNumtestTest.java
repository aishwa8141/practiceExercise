import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumtestTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isEven() {

        //arrange

        boolean expected=true;

        //act
        EvenNumtest evenNumtest=new EvenNumtest();
        boolean result=evenNumtest.isEven(2);

        //assert
        assertEquals(expected,result);
    }
}