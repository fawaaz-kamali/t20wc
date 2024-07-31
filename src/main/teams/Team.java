/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      17 July 2024
 * @description     
 * 
 * 
 * 
**********************************/
package main.teams;
import java.util.ArrayList;
import main.players.Player;

public abstract class Team
{
    private double overallRating;
    private String name;
    protected ArrayList<Player> team = new ArrayList<>();
    protected Player player1, player2, player3, player4, player5, player6, player7,
                    player8, player9, player10, player11;

    public Team()
    {
        setTeam();
    }

    public abstract void setTeam();
    /*
     * setTeam()
     * {
     *      setName(name);
     *      Player player1 = PatCummins();
     *      Player player2 = DavidWarner();
     *      ... so on and so forth
     *      team = {player1, player2, ...};
     *      setTeam(team);
     *      overall rating must be calculated
     * }
     */

    // getters
    public double getOverallRating()
    {
        return this.overallRating;
    }

    public String getName()
    {
        return this.name;
    }

    public ArrayList<Player> getTeam()
    {
        return this.team;
    }

    // setters
    public void setOverallRating(double newRating)
    {
        this.overallRating = newRating;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setTeam(ArrayList<Player> newTeam)
    {
        this.team = newTeam;
    }
}