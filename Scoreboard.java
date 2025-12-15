/*

# Answer close reading 1 questions here
1) Team 1 
2) The argument  
3) If the argument is 0, then switch to the other team 

# Answer close reading 2 questions here
1) String team1, String team2, int team1Score, int team2Score, String activeTeam
2) The class should have activeTeam 
*/

// Write the class below
public class Scoreboard {

    private String team1; 
    private String team2; 
    private int team1Score; 
    private int team2Score; 
    private String activeTeam; 

    public Scoreboard(String team1, String team2)
    {
        this.team1 = team1; 
        this.team2 = team2; 
        team1Score = 0; 
        team2Score = 0; 
        this.activeTeam = team1; 
    }

    public String getScore()
    {
        return team1Score + "-" + team2Score + "-" + activeTeam;
    }

    public void recordPlay(int point)
    {
        if (activeTeam.equals(team1))
        {
            if (point == 0)
            {
                activeTeam = team2;
            }
            else 
            {
                team1Score += point;
            } 
        }
        else if (activeTeam.equals(team2))
        {
            if (point == 0)
            {
                activeTeam = team1; 
            }
            else
            {
                team2Score += point; 
            }
        }
    }
}