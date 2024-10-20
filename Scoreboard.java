public class Scoreboard {
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;

    public Scoreboard(String one, String two) {
        teamOne = one;
        teamTwo = two;
        teamOneScore = 0;
        teamTwoScore = 0;
        activeTeam = teamOne; 
    }

    public String getScore() {
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }

    public void recordPlay(int score) {
        if (score > 0) {
            if (teamOne.equals(activeTeam)) {
                teamOneScore += score;
            } else {
                teamTwoScore += score;
            }
        } else if (score == 0) {
            // Switch the active team
            if (teamOne.equals(activeTeam)) {
                activeTeam = teamTwo;
            } else {
                activeTeam = teamOne;
            }
        }
    }
}