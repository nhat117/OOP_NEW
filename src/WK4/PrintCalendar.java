package WK4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PrintCalendar {
    // Initialise global varible
    static Calendar cal = new GregorianCalendar(); //Initialize a new gẻgorian calendar
    static int currentYear = cal.get(Calendar.YEAR);
    static int currentMonth = cal.get(Calendar.MONTH);
    static int maxDay = 1000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to cli calendar: ");
            int year = getYear(input);
            int month = getMonth(input);
            while (month > 12) {
                System.out.println("Invalid month");
                System.out.println("Please try again: ");
                month = getMonth(input);
            }
            if (year == 0) {
                prtMonth(currentYear, month);
            } else if (month == 0) {
                prtMonth(year, currentMonth);
            } else if (month == 0 && year == 0) {
                prtMonth(currentYear, currentMonth);
            } else {
                prtMonth(year, month);
            }
            System.out.println("Enter Exit to quit or press any key to continue: ");
            String inp= input.nextLine();
            if(inp.equals( "Exit")) {break;}
        }

    }

    // Print out the title of the calendar
    public static void printCaltitle(int year, int month) {
        System.out.println("                          " + MonthName(month) + " " + year);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("      Sun        Mon       Tue        Wed        Thu       Fri      Sat");
    }

    public static String MonthName (int month) {
        if (month == 0) {
            month = currentMonth + 1;
        }
        String res;
        switch (month) {
            case 1 -> res = "January";
            case 2 -> res = "February";
            case 3 -> res = "March";
            case 4 -> res = "April";
            case 5 -> res = "May";
            case 6 -> res = "June";
            case 7 -> res = "July";
            case 8 -> res = "August";
            case 9 -> res = "September";
            case 10 -> res = "October";
            case 11 -> res = "November";
            case 12 -> res = "December";
            default -> res = null;
        }
        return res;
    }

    public static void prtMonth(int year, int month) {
        if (month == 0) {
            month = currentMonth + 1;
        }
        printCaltitle(year,month);
        prtMonthContent (year, month);
    }

    public static void prtMonthContent(int year, int month) {
        int startDay = StartDay(year, month) ;
    //Get the number of day in a month
        int DayinMonth = getDayinMonth(year,month);
        // Space befor the first day in a month
        for (int i = 0; i < startDay; i ++) {
            System.out.print("          ");
        }
        for (int i = 1; i <= DayinMonth; i++)
        {
            if (i < 10)
                System.out.print("         " + i);

            else
                System.out.print("        " + i);

            if ((i + startDay) % 7 == 0)
                System.out.println("\n");

        }
        System.out.println("\n");
    }
// Determine the start day
    public static int StartDay(int year, int month) {
        int start = 3;
        int totalDay = getNumDay(year, month);
        return (totalDay + start) % 7;
    }

    public static int getNumDay(int year, int month) {
        int total = 0;
        for (int i = maxDay; i < year; i ++) {
            if (isleap(i)) {
                total += 366;
            } else {
                total += 365;
            }
        }
        for (int i = 1; i < month; i ++) {
            total += getDayinMonth(year, i);
        }
        return total;
    }

    public static int getDayinMonth (int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if (month == 2)
            return isleap(year) ? 29 : 28;
        return 0;
    }

    public static boolean isleap(int year) {
        boolean leap;
        // if the year is divided by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {
                // if year is divided by 400
                // then it is a leap year
                leap = year % 400 == 0;
            }
            // if the year is not century
            else
                leap = true;
        }

        else
            leap = false;
        return leap;
    }

    private static int getMonth(Scanner input) {
        int month;
        System.out.println("Enter month (from 1 to 12): ");
        while(!input.hasNextInt()) {
            if (!input.hasNextInt()) {
                System.out.println("The enter month is not an INT ");
            }
            System.out.println("Please enter month (from 1 to 12): ");
            input.nextInt();
        }
        month = Integer.parseInt(input.nextLine()); //Convert into interger
        return month;
    }

    private static int getYear(Scanner input) {
        int year;
        System.out.println("Enter a number of a year from 1800 (E.g. 1890...): ");
        while (!input.hasNextInt()) {
            if (!input.hasNextInt()) {
                System.out.println("The year must be an integer!");
            }
            System.out.println("Enter a number of a year from 1800 (E.g. 1890...): ");
            input.nextLine();
        }
        year = Integer.parseInt(input.nextLine());
        return year;
    }

}
