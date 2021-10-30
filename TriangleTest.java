import static org.junit.Assert.*;
import org.junit.Test;

import assignment1.Triangle;

/**
 * @class TriangleTest
 * 
 * this class contains unit test methods for testing the isTriangle () methods of the 
 * three triangle implementations.
 */
public class TriangleTest {
    
    private Triangle t;

    public TriangleTest () {
        this.t = new Triangle ();
    } // end constructor

    @Test
    public void testTriangle1 () {
        // Boundary Value Testing for three sides a, b, c with the following range:
        // side a: [1, 61]
        // side b: [11, 99]
        // side c: [15, 35]
        assertEquals ("Isosceles", t.isTriangle1 (1, 60, 60));
        assertEquals ("Isosceles", t.isTriangle1 (2, 60, 60));
        assertEquals ("Equilateral", t.isTriangle1 (60, 60, 60));
        assertEquals ("Isosceles", t.isTriangle1 (61, 60, 60));
        assertEquals ("NotATriangle", t.isTriangle1 (31, 25, 60));
        assertEquals ("NotATriangle", t.isTriangle1 (31, 26, 60));
        assertEquals ("NotATriangle", t.isTriangle1 (31, 94, 60));
        assertEquals ("NotATriangle", t.isTriangle1 (31, 95, 60));
        assertEquals ("Scalene", t.isTriangle1 (31, 60, 30));
        assertEquals ("Isosceles", t.isTriangle1 (31, 60, 31));
        assertEquals ("Scalene", t.isTriangle1 (31, 60, 89));
        assertEquals ("Scalene", t.isTriangle1 (31, 60, 90));
        assertEquals ("Isosceles", t.isTriangle1 (31, 60, 60));
    } // end testTriangle1 ()

    @Test
    public void testTriangle2 () {
        // Boundary Value Testing for three sides a, b, c with the following range:
        // side a: [1, 61]
        // side b: [11, 99]
        // side c: [15, 35]
        assertEquals ("Isosceles", t.isTriangle2 (1, 60, 60));
        assertEquals ("Isosceles", t.isTriangle2 (2, 60, 60));
        assertEquals ("Equilateral", t.isTriangle2 (60, 60, 60));
        assertEquals ("Isosceles", t.isTriangle2 (61, 60, 60));
        assertEquals ("NotATriangle", t.isTriangle2 (31, 25, 60));
        assertEquals ("NotATriangle", t.isTriangle2 (31, 26, 60));
        assertEquals ("NotATriangle", t.isTriangle2 (31, 94, 60));
        assertEquals ("NotATriangle", t.isTriangle2 (31, 95, 60));
        assertEquals ("Scalene", t.isTriangle2 (31, 60, 30));
        assertEquals ("Isosceles", t.isTriangle2 (31, 60, 31));
        assertEquals ("Scalene", t.isTriangle2 (31, 60, 89));
        assertEquals ("Scalene", t.isTriangle2 (31, 60, 90));
        assertEquals ("Isosceles", t.isTriangle2 (31, 60, 60));
    } // end testTriangle2 ()

    @Test
    public void testTriangle3 () {
        // Boundary Value Testing for three sides a, b, c with the following range:
        // side a: [1, 61]
        // side b: [11, 99]
        // side c: [15, 35]
        assertEquals ("Isosceles", t.isTriangle3 (1, 60, 60));
        assertEquals ("Isosceles", t.isTriangle3 (2, 60, 60));
        assertEquals ("Equilateral", t.isTriangle3 (60, 60, 60));
        assertEquals ("Isosceles", t.isTriangle3 (61, 60, 60));
        assertEquals ("NotATriangle", t.isTriangle3 (31, 25, 60));
        assertEquals ("NotATriangle", t.isTriangle3 (31, 26, 60));
        assertEquals ("NotATriangle", t.isTriangle3 (31, 94, 60));
        assertEquals ("NotATriangle", t.isTriangle3 (31, 95, 60));
        assertEquals ("Scalene", t.isTriangle3 (31, 60, 30));
        assertEquals ("Isosceles", t.isTriangle3 (31, 60, 31));
        assertEquals ("Scalene", t.isTriangle3 (31, 60, 89));
        assertEquals ("Scalene", t.isTriangle3 (31, 60, 90));
        assertEquals ("Isosceles", t.isTriangle3 (31, 60, 60));
    } // end testTriangle3 ()

} // end TriangleTest class definition
