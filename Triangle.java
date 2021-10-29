//==============================================================================
/**
 * @file       Triangle1.java
 *
 * AUTHOR:     Japneet Kaur
 * 
 * Honor Pledge:
 *
 * I pledge that I have neither given nor received any help
 * on this assignment.
 */
//==============================================================================

import java.util.Scanner;


public class Triangle {

    public Triangle () {
        // do nothing
    } // end constructor

    /**
     * 
     * First implementation of the isTriangle () method logic as specified in the textbook
     * 
     * @param a             side a of the triangle 
     * @param b             side b of the triangle 
     * @param c             side c of the triangle 
     * @return result       whether the sides form Isosceles, Equilateral, Scalene or NotATriangle
     */
    public String isTriangle1 (int a, int b, int c) {
        int match;
        String result = "";

        match = 0;
        if (a == b) {
            match = match + 1;
        } // end if

        if (a == c) {
            match = match + 2;
        } // end if
        
        if (b == c) {
            match = match + 3;
        } // end if


        if (match == 0) {

            if ( (a + b) <= c ) {
                result = "NotATriangle";
            } else if ( (b + c) <= a ) {
                result = "NotATriangle";
            } else if ( (a + c) <= b ) {
                result = "NotATriangle";
            } else {
                result = "Scalene";
            } // end if-else
        
        } else if (match == 1) {

            if ( (a + c) <= b ) {
                result = "NotATriangle";
            } else {
                result = "Scalene";
            } // end if-else
        
        } else if (match == 2) {
        
            if ( (a + c) <= b ) {
                result = "NotATriangle";
            } else {
                result = "Isosceles";
            } // end if-else
        
        } else if (match == 3) {

            if ( (b + c) <= a) {
                result = "NotATriangle";
            } else {
                result = "Isosceles";
            } // end if-else
        
        } else {

            result = "Equilateral";
        
        } // end if-else for match

        return result;
    } // end method isTriangle ()


    /**
     * Second implementation of the isTriangle () method logic as specified in the textbook
     * 
     * @param a             side a of the triangle 
     * @param b             side b of the triangle 
     * @param c             side c of the triangle 
     * @return result       whether the sides form Isosceles, Equilateral, Scalene or NotATriangle
     */
    public String isTriangle2 (int a, int b, int c) {

        boolean isATriangle = false;
        String result = "";

        // STEP 2: Is a Triangle?
        if ( (a < (b + c)) && (b < (a + c)) && (c < (a + b)) ) {
            isATriangle = true;
        } else {
            isATriangle = false;
        } // end if-else

        // STEP 3: Determine Triangle Type
        if (isATriangle) {

            if ( (a == b) && (b == c) ) {
                result = "Equilateral";
            } else if ( (a != b) && (a != c) && (b != c) ) {
                result = "Scalene";
            } else {
                result = "Isosceles";
            } // end if-else

        } else {
            result = "NotATriangle";
        } // end if-else

        return result;
    } // end method isTriangle2 () 

    /**
     * Third implementation of the isTriangle () method logic as specified in the textbook
     * 
     * @param a             side a of the triangle 
     * @param b             side b of the triangle 
     * @param c             side c of the triangle 
     * @return result       whether the sides form Isosceles, Equilateral, Scalene or NotATriangle
     */
    public String isTriangle3 (int a, int b, int c) {
        String result = "";

        boolean c1, c2, c3, isATriangle;
        c1 = c2 = c3 = isATriangle = false;

        // for input
        Scanner input = new Scanner (System.in);

        // STEP 1: Check conditions

        c1 = (1 <= a) && (a <= 300);
        c2 = (1 <= b) && (b <= 300);
        c3 = (1 <= c) && (c <= 300);

        if (!c1) {
            result = "Value of a is not in the range of permitted values.";
        } // end if
        
        if (!c2) {
            result = "Value of b is not in the range of permitted values.";
        } // end if

        if (!c3) {
            result = "Value of c is not in the range of permitted values.";
        } // end if

        // only continue if valid values for the sides 
        if (c1 && c2 && c3) {
            // STEP 2: Is a Triangle?
            if ( (a < (b + c)) && (b < (a + c)) && (c < (a + b)) ) {
                isATriangle = true;
            } else {
                isATriangle = false;
            } // end if-else

            // STEP 3: Determine Triangle Type
            if (isATriangle) {

                if ( (a == b) && (b == c) ) {
                    result = "Equilateral";
                } else if ( (a != b) && (a != c) && (b != c) ) {
                    result = "Scalene";
                } else {
                    result = "Isosceles";
                } // end if-else
            
            } else {
                result = "NotATriangle";
            } // end if-else
        } // end if

        return result;
    } // end method isTriangle3 ()

} // end class definition