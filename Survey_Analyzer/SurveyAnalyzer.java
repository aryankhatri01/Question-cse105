package Survey_Analyzer;

public class SurveyAnalyzer {

    public static void main(String[] args) {

        int[] responses =
                {1,2,3,4,5,3,2,1,5,4,3,2,1};

        int[] freq = new int[6];

        for (int r : responses) {
            freq[r]++;
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println(
                    "Rating " + i + ": " + freq[i]);
        }
    }
}
