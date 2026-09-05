public class TeamNameFinder {
    static String findDuplicateTeam(String[] teamNames) {
        for (int i = 0; i < teamNames.length; i++) {
            for (int j = i + 1; j < teamNames.length; j++) {
                if (teamNames[i].equals(teamNames[j])) {
                    return teamNames[i];
                }
            }
        }
        return "no duplicate team names found";

    }
    public static void main(String[] args) {
        String[] arr ={"sarathi","sarat","sarathi"};
        System.out.println(findDuplicateTeam(arr));
    }
}