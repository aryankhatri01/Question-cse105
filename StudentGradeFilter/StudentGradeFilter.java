package StudentGradeFilter;

import java.util.ArrayList;

public class StudentGradeFilter {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(95);
        scores.add(82);
        scores.add(38);
        scores.add(91);
        scores.add(65);
        scores.add(25);

        for (int score : scores) {

            if (score >= 90) {
                System.out.println(score + " : Distinction");
            } else if (score >= 40) {
                System.out.println(score + " : Pass");
            } else {
                System.out.println(score + " : Fail");
            }
        }
    }
}