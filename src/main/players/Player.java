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
    private int matchBallsBatted;
    private int matchBallsBowled;
    private int matchRunsScored;
    private int matchRunsConceded;
    private int matchWickets;

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

    /* resetStatistics(): used to reset all wickets and runs
     * to 0.
     */
    public void resetStatistics()
    {
        this.setRunsScored(0);
        this.setWicketsTaken(0);
    }

    /* used to assign batting, bowling, and overall ratings to each player */
    public abstract void setRatings();


    // INDIVIDUAL MATCH STATS

    public int getMatchBallsBatted()
    {
        return this.matchBallsBatted;
    }

    public int getMatchBallsBowled()
    {
        return this.matchBallsBowled;
    }

    public int getMatchRunsScored()
    {
        return this.matchRunsScored;
    }

    public int getMatchRunsConceded()
    {
        return this.matchRunsConceded;
    }

    public int getMatchWickets()
    {
        return this.matchWickets;
    }

    public void incrementMatchBallsBatted()
    {
        this.matchBallsBatted += 1;
    }

    public void incrementMatchBallsBowled()
    {
        this.matchBallsBowled += 1;
    }

    public void addMatchRunsScored(int runs)
    {
        this.matchRunsScored += runs;
        // this.runsScored += runs;
    }

    public void addMatchRunsConceded(int runs)
    {
        this.matchRunsConceded += runs;
        // this.matchRunsConceded += runs;
    }

    public void incrementMatchWickets()
    {
        this.matchWickets += 1;
        // this.wicketsTaken += 1;
    }
}