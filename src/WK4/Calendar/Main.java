package WK4.Calendar;

import java.util.Scanner;

import static WK4.Calendar.PrtCal.getMonth;
import static WK4.Calendar.PrtCal.printMonth;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter year");
        PrtCal cal;
        int year;
        try {
            year = PrtCal.getYear(inp);
            while (year < 1800 && year != 0) {
                System.out.println("Invalid year, please try again");
                //Handle wrong stuff
                year = PrtCal.getYear(inp);
            }
        } catch (Exception e) {
            System.out.println("You have enter invalid year please try again!!");
            year = PrtCal.getYear(inp);
        }

        //Get month
        int month;
        try {
            month = getMonth(inp);

            while (month > 12) {
                System.out.println("Invalid Month please try again");
                month = getMonth(inp);
            }

        } catch (Exception e) {
            System.out.println("Invalid Month please try again");
            month = getMonth(inp);
        }
        //Print out the calendar
        printMonth(year, month);
    }
}
