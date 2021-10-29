import static org.junit.jupiter.api.Assertions;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

/**
 * @class TriangleTest
 * 
 * this class contains unit test methods for testing the isTriangle () methods of the 
 * three triangle implementations.
 */
public class TriangleTest {
    
    private Triangle t;

    @Test
    public void testTriangle1 () {
        assertEquals ("Equilateral", t.isTriangle1 (5, 5, 5));
    }

    @Test
    public void testTriangle2 () {
        assertEquals ("Equilateral", t.isTriangle2 (5, 5, 5));
    }

    @Test
    public void testTriangle3 () {
        assertEquals ("Equilateral", t.isTriangle3 (5, 5, 5));
    }

}
