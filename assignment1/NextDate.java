//==============================================================================
/**
 * @file       NextDate.java
 *
 * AUTHOR:     Japneet Kaur
 * 
 * Honor Pledge:
 *
 * I pledge that I have neither given nor received any help
 * on this assignment.
 */
//==============================================================================

package assignment1;

public class NextDate {
    
    public NextDate () {
        // do nothing 
    } // end constructor 

    /**
     * 
     * First implementation of the nextDate () method logic as specified in the textbook
     * 
     * @param day             current day of the month
     * @param month           current month of the year
     * @param year            current year 
     * @return result         Tomorrow's date in the form of a string
     */
    public String nextDate1 (int day, int month, int year) {  
        String result = "";

        int tomorrowDay = 1;
        int tomorrowMonth = 1;
        int tomorrowYear = 1812;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day < 31) {
                    tomorrowDay = day + 1;
                } else {
                    tomorrowDay = 1;
                    tomorrowMonth = month + 1;
                } // if-else
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 30) {
                    tomorrowDay = day + 1;
                } else {
                    tomorrowDay = 1;
                    tomorrowMonth = month + 1;
                } // end if-else
                break;

            case 12:
                if (day < 31) {
                    tomorrowDay = day + 1;
                } else {
                    tomorrowDay = 1;
                    tomorrowMonth = 1;
                    if (year == 2012) {
                        result = "2012 is over.";
                    } else {
                        tomorrowYear = year + 1;
                    } // end if-else
                } // end if-else
                break;

            case 2:
                if (day < 28) {
                    tomorrowDay = day + 1;
                } else {
                    if (day == 28) {
                        // if year is a leap year
                        if (year % 4 == 0) {
                            tomorrowDay = 29;
                        } // end if
                        // not a leap year 
                        else {
                            tomorrowDay = 1;
                            tomorrowMonth = 3;
                        } // end else
                    } else if (day == 29) {
                        // if year is a leap year
                        if (year % 4 == 0) {
                            tomorrowDay = 1;
                            tomorrowMonth = 3;
                        } else {
                            result = "Cannot have Feb. " + day;
                        } // end if -else
                    } // end if
                } // end if-else
                break;
        } // end switch-case
        
        result = tomorrowMonth + "-" + tomorrowDay + "-" + tomorrowYear;
        return result;
    } // end nextDate1 ()

    

    /**
     * 
     * Second implementation of the nextDate () method logic as specified in the textbook
     * 
     * @param day             current day of the month
     * @param month           current month of the year
     * @param year            current year 
     * @return result         Tomorrow's date in the form of a string
     */
    public String nextDate2 (int day, int month, int year) {
        String result;

        int tomorrowDay = 1;
        int tomorrowMonth = 1;
        int tomorrowYear = 1812;
    
        boolean c1, c2, c3;
        c1 = c2 = c3 = false;
        
        c1 = (1 <= day) && (day <= 31);
        c2 = (1 <= month) && (month <= 12);
        c3 = (1812 <= year) && (year <= 2012);

        if (!c1) {
            System.out.println ("Value of day not in the range 1......31");
            result = "Invalid Input Date";
        } // end if
        
        if (!c2) {
            System.out.println ("Value of month not in the range 1.....12");
            result = "Invalid Input Date";
        } // end if

        if (!c3) {
            System.out.println ("Value of year not in the range 1812..........2012");
            result = "Invalid Input Date";
        } // end if

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day < 31) {
                    tomorrowDay = day + 1;
                } else {
                    tomorrowDay = 1;
                    tomorrowMonth = month + 1;
                } // end if-else
                break;
            
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 30) {
                    tomorrowDay = day + 1;
                } else {
                    if (day == 30) {
                        tomorrowDay = 1;
                        tomorrowMonth = month + 1;
                    } else {
                        result = "Invalid Input Date";
                    } // end if
                } // end if
                break;
            
            case 12:
                if (day < 31) {
                    tomorrowDay = day + 1;
                } else {
                    tomorrowDay = 1;
                    tomorrowMonth = 1;
                    if (year == 2012) {
                        result = "Invalid Input Date";
                    } else {
                        tomorrowYear = year + 1;
                    } // end if
                } // end if
                break;
    
            case 2:
                if (day < 28) {
                    tomorrowDay = day + 1;
                } else {
                    if (day == 28) {
                        // if leap year
                        if (year % 4 == 0) {
                            tomorrowDay = 29;
                        } else {
                            tomorrowDay = 1;
                            tomorrowMonth = 3;
                        } // end if
                    } else if (day == 29) {
                        if (year % 4 == 0) {
                            // if a leap year
                            tomorrowDay = 1;
                            tomorrowMonth = 3;
                        } else {
                            if (day > 29) {
                                result = "Invalid Input Date";
                            } // end if
                        } // end if 
                    } // end if
                } // end if
                break;
        } // end switch-case
    
        result = tomorrowMonth + "-" + tomorrowDay + "-" + tomorrowYear;
        return result; 
    } // end nextDate2 ()
    
} // end class definition
