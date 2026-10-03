public class HackathonSeatingGridOptimizer {

    private static double rowAverage(int[] row) {
        int sum = 0;

        for (int i = 0; i < row.length; i++) {
            sum += row[i];
        }

        return (double) sum / row.length;
    }

    static String[] classifyRows(int[][] seatingScores, int threshold) {

        String[] result = new String[seatingScores.length];

        for (int i = 0; i < seatingScores.length; i++) {

            double average = rowAverage(seatingScores[i]);

            if (average < threshold) {
                result[i] = "Row " + i + ": Quiet Zone";
            } else {
                result[i] = "Row " + i + ": Buzzing Zone";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] seatingScores = {
            {40, 50, 45},
            {85, 90, 95},
            {30, 20, 25}
        };

        int threshold = 60;

        String[] output = classifyRows(seatingScores, threshold);

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);

            if (i < output.length - 1) {
                System.out.print(" | ");
            }
        }
    }
}