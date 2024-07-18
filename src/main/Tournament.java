/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      18 July 2024
 * @description     
 * 
 * 
 * 
**********************************/
package main;
import main.teams.Team;
import java.util.ArrayList;


public class Tournament
{
    
    /*****************
     * simulateMatch(): considers the rating of both teams 
     * to predict the winner of the match. Games in cricket 
     * can be unpredictable, so this method is also random.
     * Used to simulate matches played by non-user teams.
     * If the overall rating difference between two teams is
     * < 1:       it's a 50-50 game
     * 1 < x < 2: it's a 60-40 game favoring the higher rated team
     * 2 < x < 3: it's a 70-30 game favoring the higher rated team
     * 3 < x < 5: it's a 80-20 game favoring the higher rated team
     * 5 < x < 8: it's a 90-10 game favoring the higher rated team
     * > 8:       it's a 95-5 game favoring the higer rated team
     */
    public static Team simulateMatch(Team team1, Team team2)
    {
        Team winner = new Team(); // should be modified
        // TODO: simulation criteria
        return winner;
    } 

    /*****************************
     * simulateRound(): simulates all matches in a tournament round
     * (QF, SF, etc.) until a user game is played. Returns an array 
     * for the matches for next round.
     */
    public static ArrayList<Team> simulateRound(ArrayList<Team> currentRound)
    {
        ArrayList<Team> nextRound = new ArrayList<>();
        // TODO: simulate games and add them to arraylist as long as there user matches are not simulated
        return nextRound;
    }

    /*****************************
     * displayBracket(): displays progress of tournament brackets
     * starting from R16
     */
    public static void displayBracket()
    {
        // TODO
    }

    /******************************
     * displayStats(): ranks the top wicket takers and run scorers
     * from a team.
     */
    public static void displayStats(Team team)
    {
        // TODO
    }

}