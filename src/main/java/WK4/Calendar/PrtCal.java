//package WK4.Calendar;
//
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//import java.util.Scanner;
//
//public class PrtCal {
//    static Calendar calendar = new GregorianCalendar();
//    static int currentYear = calendar.get(Calendar.YEAR);
//    static int currentMonth = calendar.get(Calendar.MONTH);
//
//    public static void printMonth(int year, int month) {
//        if (month == 0) {
//            month = currentMonth + 1;
//        }
//
//        if (year == 0) {
//            year = currentYear;
//        }
//        printMonthTitle(year, month);
//        printMonthBody(year, month);
//    }
//
//    public static void printMonthTitle(int year, int month) {
//        System.out.println("                          " + getMonthName(month) + " " + year);
//        System.out.println("------------------------------------------------------------------------------");
//        System.out.println("      Sun        Mon       Tue        Wed        Thu       Fri      Sat");
//    }
//
//    public static String getMonthName(int month) {
//        //string to contain the month's name
//        if (month == 0) {
//            month = currentMonth + 1;
//        }
//        return switch (month) {
//            case 1 -> "January";
//            case 2 -> "February";
//            case 3 -> "March";
//            case 4 -> "April";
//            case 5 -> "May";
//            case 6 -> "June";
//            case 7 -> "July";
//            case 8 -> "August";
//            case 9 -> "September";
//            case 10 -> "October";
//            case 11 -> "November";
//            case 12 -> "December";
//            default -> null;
//        };
//    }
//
//    public static void printMonthBody(int year, int month) {
//        int startDay = getStartDay(year, month);
//        // Get number of days in the month
//        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
//        // Pad space before the first day of the month
//        int i;
//        for (i = 0; i < startDay; i++)
//            System.out.print("          ");
//
//        for (i = 1; i <= numberOfDaysInMonth; i++) {
//            if (i < 10)
//                System.out.print("         " + i);
//
//            else
//                System.out.print("        " + i);
//
//            if ((i + startDay) % 7 == 0)
//                System.out.println();
//
//        }
//        System.out.println();
//    }
//
//    public static int getStartDay(int year, int month) {
//        int startDay1800 = 3;
//        int totalNumberOfDays = getTotalNumberOfDays(year, month);
//        return (totalNumberOfDays + startDay1800) % 7;
//    }
//
//    public static int getTotalNumberOfDays(int year, int month) {
//        int total = 0;
//        for (int i = 1800; i < year; i++) {
//            if (isLeapYear(i))
//                total = total + 366;
//            else
//                total = total + 365;
//        }
//        for (int i = 1; i < month; i++) {
//            total = total + getNumberOfDaysInMonth(year, i);
//        }
//        return total;
//    }
//
//    public static int getNumberOfDaysInMonth(int year, int month) {
//        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
//            return 31;
//        if (month == 4 || month == 6 || month == 9 || month == 11)
//            return 30;
//        if (month == 2)
//            return isLeapYear(year) ? 29 : 28;
//
//        return 0;
//    }
//
//    public static boolean isLeapYear(int year) {
//        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
//    }
//
//    static int getYear(Scanner input) {
//        int year;
//        System.out.println("Enter a number of a year from 1800 (E.g. 1890...): ");
//        while (!input.hasNextInt()) {
//            if (!input.hasNextInt()) {
//                System.out.println("The year must be an integer!");
//            }
//            System.out.println("Enter a number of a year from 1800 (E.g. 1890...): ");
//            input.nextLine();
//        }
//        year = Integer.parseInt(input.nextLine());
//        return year;
//    }
//
//    static int getMonth(Scanner input) {
//        int month;
//        System.out.println("Enter a number of month (from 1 to 12): ");
//        while (!input.hasNextInt()) {
//            if (!input.hasNextInt()) {
//                System.out.println("The month must be an integer!");
//            }
//            System.out.println("Enter a number of month (from 1 to 12): ");
//            input.nextLine();
//        }
//        month = Integer.parseInt(input.nextLine());
//        return month;
//    }
//}
