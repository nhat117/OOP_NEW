import javax.xml.stream.events.DTD;
import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;
enum Month {Jan , Feb, Mar, Apr, May, Jun, Jul , Aug, Sep, Oct, Nov, Dec};
public class Ex1 {
    public static Month Monthvar = Month.Jan;

    public static boolean MonthValidate (String month) {
        boolean res = false;
        Month [] allMonth = Month.values();
        for (Month M: allMonth) {
            // Comparing
            if (M.toString().toLowerCase(Locale.ROOT).equals(month.toLowerCase())) {
                Monthvar = Month.valueOf(month);
                res = true;
            }
        }
        return  res;
    }

    public static int CalDay (int year, String month) {
        int Days;
        if (Monthvar == Month.Apr || Monthvar == Month.Jun || Monthvar == Month.Sep || Monthvar == Month.Nov) {
            Days = 30;
        } else if (Monthvar == Month.Feb) {
            if (year % 4 == 0 ) {Days = 29;} else {Days = 28;}
        } else {
            Days = 31;
        }
        return Days;
    }

    public static void Display (int year, String month) {
        if (!MonthValidate(month)) {
            System.out.println("Invalid Month");
        } else {
            System.out.println(month + " of " + year + " have " + CalDay(year, month) + " days");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt user enter a year
        System.out.println("Enter a year");
        int year = input.nextInt();
        // Prompt enter Month
        System.out.println("Enter a month");
        String month = input.next();
        Display(year, month);
    }
}
