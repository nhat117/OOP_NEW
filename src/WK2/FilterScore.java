package WK2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FilterScore {
    //Read unspecofied number of score in one inout and determines how many scores are aboe or equal or below avg
    static final int NUMSCORE = 4;
    static final int MAXNUM = 9;
    static final int MINNUM = 1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> score = new ArrayList<>();
        //Enter unspecified amount of number
        System.out.println("Enter score btw 1 and 10");
        int tmp = 0;
        while (true) {
            tmp = input.nextInt();
            System.out.println(tmp);
            if (tmp < 0 || tmp > 10) {
                break;
            }
            score.add(tmp);
        }

//            generateRandom(score);
        if (score.size() != 0) {
            scoreFilter(score);
        }
    }

    //Determine the score

    public static void scoreFilter(ArrayList<Integer> arrInput) {
        int avg = (Collections.max(arrInput) + Collections.min(arrInput)) / arrInput.size();
        int scoreBelowAvg = 0;
        int scoreAvg = 0;
        int scoreOverAvg = 0;
        for (int i = MINNUM; i < MAXNUM; i++) {
            int occur = Collections.frequency(arrInput, i);
            if (i < avg) {
                scoreBelowAvg += occur;
            } else if (i == avg) {
                scoreAvg += occur;
            } else {
                scoreOverAvg += occur;
            }
        }
        System.out.println("Avg score is " + avg);
        System.out.println(scoreBelowAvg + " below average");
        System.out.println(scoreAvg + " Average");
        System.out.println(scoreOverAvg + " Over Average");
    }


}
