// -*- Java -*-

//==============================================================================
/**
 * @file       Triangle3.java
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

public class Triangle3 {
    
    public static void main (String [] args) {
        
        // sides of the triangle
        int a = 1;
        int b = 1;
        int c = 1;
        boolean c1, c2, c3, isATriangle;
        c1 = c2 = c3 = isATriangle = false;

        // for input
        Scanner input = new Scanner (System.in);

        // STEP 1: Get Input
        do {
            System.out.println("Enter 3 integers which are sides of a triangle: ");
            a = input.nextInt ();
            b = input.nextInt ();
            c = input.nextInt ();

            c1 = (1 <= a) && (a <= 300);
            c2 = (1 <= b) && (b <= 300);
            c3 = (1 <= c) && (c <= 300);

            if (!c1) {
                System.out.println ("Value of a is not in the range of permitted values.");
            } // end if
            
            if (!c2) {
                System.out.println ("Value of b is not in the range of permitted values.");
            } // end if

            if (!c3) {
                System.out.println ("Value of c is not in the range of permitted values.");
            } // end if

        } while ( !(c1 && c2 && c3) );
        // end do-while
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

} // end Triangle3 class def