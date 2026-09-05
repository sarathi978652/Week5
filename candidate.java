import java.util.Arrays;

class Candidate implements Comparable<Candidate> {

    private String name;
    private double cgpa;
    private int codingScore;

    // Constructor
    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public int getCodingScore() {
        return codingScore;
    }

    // Composite score
    public double getCompositeScore() {
        return cgpa * 10 + codingScore * 0.5;
    }

    // Overloaded method 1
    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    // Overloaded method 2
    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    // Sort by composite score - descending
    @Override
    public int compareTo(Candidate other) {
        return Double.compare(
            other.getCompositeScore(),
            this.getCompositeScore()
        );
    }

    // Shortlist and rank
    static String shortlistAndRank(Candidate[] candidates) {

        Candidate[] shortlisted = new Candidate[candidates.length];

        int count = 0;

        for (Candidate candidate : candidates) {

            if (isEligible(candidate.getCgpa())
                    || isEligible(candidate.getCgpa(),
                                  candidate.getCodingScore())) {

                shortlisted[count] = candidate;
                count++;
            }
        }

        // Create array containing only shortlisted candidates
        Candidate[] result = Arrays.copyOf(shortlisted, count);

        // Java does the sorting using compareTo()
        Arrays.sort(result);

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < result.length; i++) {

            if (i > 0) {
                output.append(" | ");
            }

            output.append(i + 1)
                  .append(". ")
                  .append(result[i].getName())
                  .append(" (")
                  .append(result[i].getCompositeScore())
                  .append(")");
        }

        return output.toString();
    }

    public static void main(String[] args) {

        Candidate[] candidates = {
            new Candidate("Aisha", 6.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Heena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };

        System.out.println(shortlistAndRank(candidates));
    }
}