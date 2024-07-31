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
    private ArrayList<Player> team;

    public Team()
    {
        setTeam();
    }

    public abstract void setTeam();
    /*
     * setTeam()
     * {
     *      Player player1 = PatCummins();
     *      Player player2 = DavidWarner();
     *      ... so on and so forth
     *      team = {player1, player2, ...};
     *      setTeam(team);
     *      overall rating must be calculated
     *      setName(name);
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