import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void powerof4() {

        //arrange
        boolean expected=true;


        //act

        Power power=new Power();
        boolean res = power.powerof4(16);


        //assert

        assertEquals(expected,res);

    }
}