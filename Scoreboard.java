/*

# Answer close reading 1 questions here


# Answer close reading 2 questions here

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