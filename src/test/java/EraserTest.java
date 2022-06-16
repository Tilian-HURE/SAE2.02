package test.java;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import analyse.solutions.efficacite135; //replace this line


public class EraserTest {

    @Test
    public void testSolution() {
        assertEquals("", efficacite135.erase(""));
        assertEquals("666,thenumberofthebeast", efficacite135.erase("666, the number of the beast"));
        assertEquals("06   07651970", efficacite135.erase("06   07 65 19 70 "));
        assertEquals("OK", efficacite135.erase("OK"));
        assertEquals("Coucou  JM  B", efficacite135.erase("Cou cou  J M  B"));
        assertEquals("", efficacite135.erase(" "));
        assertEquals("  ", efficacite135.erase("  "));
    }

}