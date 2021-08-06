package WK1;

public class Kilometertable {

    public static void main(String[] args) {
        System.out.println("Miles   Kilometers   |   Kilometers   Miles");
        for (int i = 1; i <= 10; i ++ ) {
            int Miles = i;
            int Kilometers = i * 5 + 15;
            double Kilores = (double) Miles * 1.609;
            double   Milesres = (double)Kilometers / 1.609;
            System.out.printf(" %d        %5.2f      |       %d       %5.2f%n", Miles, Kilores, Kilometers, Milesres);
        }
    }
}
