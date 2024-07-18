/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      17 July 2024
 * @description     
 * 
 * 
 * 
**********************************/
package main;
import main.players.Player;
import main.teams.Team;


public class Match
{

    // MATCH VARIABLES
    private int currentRuns;
    private int currentWickets;
    private Player currentBowler;
    private Player currentStriker;
    private Player currentNonStriker;
    private int target;
    

    /****************
     * wicketCommentary(): when a wicket is taken, there will 
     * be a slow printed commentary to make the game realistic
     */
    public static void wicketCommentary(Player bowler, Player batsman)
    {
        // TODO: randomize commentary lines and pick any
    }

    /*****************
     * boundaryCommentary(): when a batsman hits a boundary, there will
     * be a slow printed commentary to make the game realistic
     */
    public static void boundaryCommentary(Player batsman, Player bowler)
    {
        // TODO: randomize commentary lines and pick any
    }

    /*****************
     * playOver(): plays out an entire over bowled by a single bowler. 
     * Extras are counted, and the over can only end in the middle if all
     * wickets are taken or target is chased. Bowler must guess the same 
     * number as batsman in a given range to take a wicket.
     */
    public static void playOver(Player bowler)
    {
        // TODO
    }

    /****************
     * playInnings(): plays out an entire batting innings of 10 overs.
     * A bowler may bowl 3 overs maximum only. An inning may end abruptly
     * if either the target is chased, or all wickets are taken. It is easy
     * for players with higher batting ratings to bat and vice versa.
     */
    public static void playInnings()
    {
        // TODO
    }

    /*****************
     * playMatch(): plays out an entire match of 2 innings. The method returns 
     * winner from match to advance to next round.
     */
    public static Team playMatch()
    {
        // TODO
    }
}