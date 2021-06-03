import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex1_Chau {
    public static boolean MonthValidate (String Month) {
        return  Month.equals("Jan")|| Month.equals("Mar")|| Month.equals("May")|| Month.equals("Jul")||
                Month.equals("Aug")|| Month.equals("Oct")|| Month.equals("Dec");
    }
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a BC year: ");
        int year = input.nextInt();
        while (year < 1 )
        {
            System.out.println("Enter a BC year: ");
            year = input.nextInt();
        }
        System.out.println("Enter a month: ");
        String Month = input.next();

        while (MonthValidate(Month))
        {   System.out.println("Enter a month with 3 first character with the 1st character in Uppercase!");
            System.out.println("Enter a month: ");
            Month = input.next();
        }
        printMonth(year, Month);
    }

    public static void printMonth(int year, String Month)
    {  int dayInMonth = 0;
        Month = Month.toLowerCase(Locale.ROOT);
        if(Month.equals("Jan".toLowerCase(Locale.ROOT))|| Month.equals("Mar".toLowerCase(Locale.ROOT))|| Month.equals("May".toLowerCase(Locale.ROOT))|| Month.equals("Jul".toLowerCase(Locale.ROOT))||
                Month.equals("Aug".toLowerCase(Locale.ROOT))|| Month.equals("Oct".toLowerCase(Locale.ROOT))|| Month.equals("Dec".toLowerCase(Locale.ROOT)))
        {
            dayInMonth = 31;
        }
        else if (Month.equals("Feb".toLowerCase(Locale.ROOT)))
        {
            if (isLeapYear(year))
                dayInMonth = 29;
            else
                dayInMonth = 28;
        }
        else {
            dayInMonth = 30;
        }
        System.out.println(Month+ "  "+ year + "  " + "has" + "  "+ dayInMonth + "  " + "days");
    }

    public static boolean isLeapYear (int year)
    {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

}
