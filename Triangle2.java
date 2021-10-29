// -*- Java -*-

//==============================================================================
/**
 * @file       Triangle2.java
 *
 * AUTHOR:     Japneet Kaur
 * 
 * Honor Pledge:
 *
 * I pledge that I have neither given nor received any help
 * on this assignment.
 */
//==============================================================================

import java.util.*;

public class Triangle2 {

    public static void main (String[] args) {

        // sides of the triangle
        int a = 1;
        int b = 1;
        int c = 1;
        boolean isATriangle = false;

        // STEP 1: Get Input
        Scanner input = new Scanner (System.in);
        System.out.println("Enter 3 integers which are sides of a triangle: ");
        a = input.nextInt ();
        b = input.nextInt ();
        c = input.nextInt ();
        input.close ();

        System.out.println ("Side A is " + a);
        System.out.println ("Side B is " + b);
        System.out.println ("Side C is " + c);

        // STEP 2: Is a Triangle?
        if ( (a < (b + c)) && (b < (a + c)) && (c < (a + b)) ) {
            isATriangle = true;
        } else {
            isATriangle = false;
        } // end if-else

        // STEP 3: Determine Triangle Type
        if (isATriangle) {

            if ( (a == b) && (b == c) ) {
                System.out.println ("Equilateral");
            } else if ( (a != b) && (a != c) && (b != c) ) {
                System.out.println ("Scalene");
            } else {
                System.out.println("Isosceles");
            } // end if-else
        
        } else {
            System.out.println ("NotATriangle");
        } // end if-else

    } // end main

} // end Triangle2 class definition