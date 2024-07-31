/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      30 July 2024
 * @description     
 * 
 * 
 * 
**********************************/
package main.players;


public abstract class Player
{
    private int battingRating;
    private int bowlingRating;
    private int overallRating;
    private int runsScored;
    private int wicketsTaken;
    private String name;

    public Player()
    {
        setRatings();
    }

    // getters
    public int getBattingRating()
    {
        return this.battingRating;
    }

    public int getBowlingRating()
    {
        return this.bowlingRating;
    }

    public int getOverallRating()
    {
        return this.overallRating;
    }

    public int getRunsScored()
    {
        return this.runsScored;
    }

    public int getWicketsTaken()
    {
        return this.wicketsTaken;
    }

    public String getName()
    {
        return this.name;
    }

    // setters
    public void setBattingRating(int newRating)
    {
        this.battingRating = newRating;
    }

    public void setBowlingRating(int newRating)
    {
        this.bowlingRating = newRating;
    }

    public void setOverallRating(int newRating)
    {
        this.overallRating = newRating;
    }

    public void setRunsScored(int runs)
    {
        this.runsScored = runs;
    }

    public void setWicketsTaken(int wickets)
    {
        this.wicketsTaken = wickets;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    /* used to assign batting, bowling, and overall ratings to each player */
    public abstract void setRatings();
}