public class Scoreboard {
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;

    public Scoreboard(String one, String two) {
        teamOne = one;
        teamTwo = two;
        activeTeam = teamOne;
    }

    public void recordPlay(int score) {
        if (score>0) {
            if (teamOne.equals(activeTeam)) {
            teamOneScore += score;}
        else if (teamTwo.equals(activeTeam)) {
            teamTwoScore += score;
            }
        }
            
        
        else if (score == 0) {
            if (activeTeam.equals(teamOne))
                activeTeam = teamTwo;
            else (activeTeam.equals(teamTwo))
                activeTeam = teamOne;
        }
    }

    public String getScore() {
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }
}


public void recordPlay(int score) {
    if (score > 0) {  // Check if points are scored
        if (activeTeam.equals(teamOne)) {
            teamOneScore += score;  // Update team one score
        } else if (activeTeam.equals(teamTwo)) {
            teamTwoScore += score;  // Update team two score
        }
        // The active team remains the same if points are scored
    } else if (score == 0) {  // If no points are scored
        if (activeTeam.equals(teamOne)) {
            activeTeam = teamTwo;  // Switch to team two
        } else {
            activeTeam = teamOne;  // Switch to team one
        }
