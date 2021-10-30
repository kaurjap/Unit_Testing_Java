import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @class NextDateTest
 * 
 * this class contains unit test methods for testing the nextDate () methods of the 
 * two next date calculation implementations given the current date.
 */
public class NextDateTest {

    private NextDate d;

    public NextDateTest () {
        this.d = new NextDate ();
    } // end constructor

    /**
    Boundary Value Analysis test cases for three variables (day, month year)
    with the following ranges yields the test cases listed below.
    day: [1, 31]
    month: [1, 12]
    year: [2012, 2021]
    
     * Following test cases:
     * month    day         year
     * 01        16         2016
     * 02        16         2016
     * 11       16          2016
     * 12       16          2016
     * 06        01         2016   
     * 06        02         2016
     * 06        30         2016
     * 06        31         2016
     * 06        16         2012
     * 06        16         2013
     * 06        16         2020
     * 06        16         2021
     * 06        16         2016   -->     (nom1, nom2, nom3)
     */

    @Test 
    public void testNextDate1 () {
        
        assertEquals ("1-17-2016", d.nextDate1 (1, 16, 2016));
        assertEquals ("2-17-2016", d.nextDate1 (2, 16, 2016));
        assertEquals ("11-17-2016", d.nextDate1 (11, 16, 2016));
        assertEquals ("12-17-2016", d.nextDate1 (12, 16, 2016));
        assertEquals ("6-2-2016", d.nextDate1 (6, 1, 2016));
        assertEquals ("6-3-2016", d.nextDate1 (6, 2, 2016));
        assertEquals ("7-1-2016", d.nextDate1 (6, 30, 2016));
        assertEquals ("Invalid Input Date", d.nextDate1 (6, 31, 2016));
        assertEquals ("6-17-2012", d.nextDate1 (6, 16, 2012));
        assertEquals ("6-17-2013", d.nextDate1 (6, 16, 2013));
        assertEquals ("6-17-2020", d.nextDate1 (6, 16, 2020));
        assertEquals ("6-17-2021", d.nextDate1 (6, 16, 2021));
        assertEquals ("6-17-2016", d.nextDate1 (6, 16, 2016));

    } // end testNextDate1 ()


    @Test
    public void testNextDate2 () {

        assertEquals ("1-17-2016", d.nextDate2 (1, 16, 2016));
        assertEquals ("2-17-2016", d.nextDate2 (2, 16, 2016));
        assertEquals ("11-17-2016", d.nextDate2 (11, 16, 2016));
        assertEquals ("12-17-2016", d.nextDate2 (12, 16, 2016));
        assertEquals ("6-2-2016", d.nextDate2 (6, 1, 2016));
        assertEquals ("6-3-2016", d.nextDate2 (6, 2, 2016));
        assertEquals ("7-1-2016", d.nextDate2 (6, 30, 2016));
        assertEquals ("Invalid Input Date", d.nextDate2 (6, 31, 2016));
        assertEquals ("6-17-2012", d.nextDate2 (6, 16, 2012));
        assertEquals ("6-17-2013", d.nextDate2 (6, 16, 2013));
        assertEquals ("6-17-2020", d.nextDate2 (6, 16, 2020));
        assertEquals ("6-17-2021", d.nextDate2 (6, 16, 2021));
        assertEquals ("6-17-2016", d.nextDate2 (6, 16, 2016));

    } // end testNextDate2 ()
}

