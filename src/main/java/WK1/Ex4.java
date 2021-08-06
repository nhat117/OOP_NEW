package WK1;

public class Ex4 {
    public static void main(String[] args)
    {
        // here we are initializing and setting table size
        final int tableNum = 12;
        // here we are printing row
        System.out.print("   |");
        for(int a = 1; a <= tableNum; a++)
            System.out.print(addSpace(a) + " ");
        System.out.println();
        // here we are printing separator
        System.out.print("---+");
        for(int a = 1; a <= tableNum; a++)
            System.out.print("----");
        System.out.println();
        // now printing main table
        for(int a = 1; a <= tableNum; a++)
        {
            System.out.print(addSpace(a) + "|");
            for(int b = 1; b <= tableNum; b++)
            {
                System.out.print(addSpace(a * b) + " ");
            }
            System.out.println();
        }
    }

    public static String addSpace(int y)
    {
        String str = new String();
        if(y < 10) str = "  " + y;
        else if(y < 100) str = " " + y;
        else str = "" + y;
        return str;
    }
}
