import java.util.Arrays;
public class podium_finder {
    static int[] findTopthreeScores(int[] scores) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int score : scores) {
            if (score > first) {
                third = second;
                second = first;
                first = score;
            } else if (score > second) {
                third = second;
                second = score;
            } else if (score > third) {
                third = score;
            }
        }
        return new int[]{first, second, third};
    }
    public static void main(String[] args) {
        int[] scores = {101,1,2,3,4,5,6,7,8,9,10,100};
        System.out.println(Arrays.toString(findTopthreeScores(scores)));
    }
}
