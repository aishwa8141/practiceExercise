import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static javafx.scene.input.KeyCode.L;
import static org.junit.Assert.*;

public class StudentRecordTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    int studentGrade[]={10,14,13,24};
    StudentRecord studentRecord=new StudentRecord();
    @Test
    public void average() {
        //arrange

        float expected=15.25f;

        //act

        float res=studentRecord.average(studentGrade);


        //assert
        assertEquals(expected,res,0);
    }

    @Test
    public void minimum() {

        //arrange
        int expected=10;

        //act
        int res = studentRecord.minimum(studentGrade);
        //assert

        assertEquals(expected,res,0);
    }

    @Test
    public void maximum() {

        //arrange

        int expected=24;

        //act
        int res=studentRecord.maximum(studentGrade);

        //assert

        assertEquals(expected,res,0);
    }
}