import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverse() {
        //arrange
        boolean expected=true;
        //act

        Palindrome pali=new Palindrome();
        boolean result=pali.reverse("121");

        //assert
        assertEquals(expected,result);

    }
}