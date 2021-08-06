package WK4.Person;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Status status = new Status();
        Student a = new Student("dashf", "ashdgfjklsahgjkasdg", "8129o03758092347590127", "ahsdkflhj@dhfgkajh.com", status);
        Faculty b = new Faculty("adshjk", "asdg", "5127809", "gjagda", "HJKLASDF", "1234678", LocalDate.now(), LocalTime.now(), LocalTime.now(), "OHD");
        System.out.println(a);
        System.out.println(b);
    }
}
