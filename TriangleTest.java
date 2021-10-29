import static org.junit.Assert.*;
import org.junit.Test;

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
    }

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
