package WK2;

public class RandomInterger {
    //Enter 100 random interger and count the occurence of each numebr
    final static int SIZE = 100;

    public static void main(String[] args) {
        int[] arr = new int[SIZE];
        generateRandom(arr);
        outputOccurence(arr);
    }

    public static void outputOccurence(int[] arrInput) {
        for (int i = 1; i < 9; i++) {
            int count = occurenceCount(arrInput, 0, arrInput.length - 1, i);
            if (count > 0) {
                System.out.printf("%d occur %d times\n", i, count);
            }
        }
    }

    public static void generateRandom(int[] arrInput) {
        final int MAXNUM = 9;
        final int MINNUM = 1;
        for (int i = 0; i < arrInput.length; i++) {
            arrInput[i] = (int) (Math.random() * (MAXNUM - MINNUM + 1) + MINNUM);
        }
    }

    //Return the occurence
    public static int occurenceCount(int[] arrInput, int lowPoint, int highPoint, int key) {
        //Using devide and conquer
        //Devide
        //If there is no element appear on the array
        if ((lowPoint > highPoint) || (lowPoint == highPoint && arrInput[lowPoint] != key)) {
            return 0;
        }
        //If exist the single element equal to the key
        if (highPoint == lowPoint && arrInput[lowPoint] == key) {
            return 1;
        }

        //Devide the array into twopart
        return occurenceCount(arrInput, lowPoint, (lowPoint + highPoint) / 2, key)
                + occurenceCount(arrInput, 1 + (lowPoint + highPoint) / 2, highPoint, key);
    }
}
