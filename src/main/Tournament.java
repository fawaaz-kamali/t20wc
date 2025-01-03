/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      18 July 2024
 * @description     
 * 
 * 
 * 
**********************************/
package main;

import main.players.Player;
import main.teams.Team;
import java.util.ArrayList;

public class Tournament {

    /*****************
     * simulateMatch(): considers the rating of both teams
     * to predict the winner of the match. Games in cricket
     * can be unpredictable, so this method is also random.
     * Used to simulate matches played by non-user teams.
     * If the overall rating difference between two teams is
     * <= 1: it's a 50-50 game
     * 1 < x <= 2: it's a 60-40 game favoring the higher rated team
     * 2 < x <= 3: it's a 70-30 game favoring the higher rated team
     * 3 < x <= 5: it's a 80-20 game favoring the higher rated team
     * 5 < x <= 8: it's a 90-10 game favoring the higher rated team
     * > 8: it's a 95-5 game favoring the higer rated team
     */
    public static Team simulateMatch(Team team1, Team team2) 
    {
        // Team winner = new Team(); // should be modified
        double rating1 = team1.getOverallRating();
        double rating2 = team2.getOverallRating();
        double higherRating = (rating1 >= rating2) ? rating1 : rating2; // assigns the highest rating value here
        int higherRatingTeam = (rating1 >= rating2) ? 1 : 2;
        int lowerRatingTeam = (rating1 < rating2) ? 1 : 2;
        double difference = Math.abs(rating1 - rating2);
        int winningTeam = 0;

        // Simulation criterion
        if (difference <= 1) 
        {
            winningTeam = ((int) (Math.random() * 100 + 1) <= 50) ? higherRatingTeam : lowerRatingTeam;
        }
        else if (difference > 1 && difference <= 2)
        {
            winningTeam = ((int) (Math.random() * 100 + 1) <= 60) ? higherRatingTeam : lowerRatingTeam;
        }
        else if (difference > 2 && difference <= 3)
        {
            winningTeam = ((int) (Math.random() * 100 + 1) <= 70) ? higherRatingTeam : lowerRatingTeam;
        }
        else if (difference > 3 && difference <= 5)
        {
            winningTeam = ((int) (Math.random() * 100 + 1) <= 80) ? higherRatingTeam : lowerRatingTeam;
        }
        else if (difference > 5 && difference <= 8)
        {
            winningTeam = ((int) (Math.random() * 100 + 1) <= 90) ? higherRatingTeam : lowerRatingTeam;
        }
        else if (difference > 8)
        {
            winningTeam = ((int) (Math.random() * 100 + 1) <= 95) ? higherRatingTeam : lowerRatingTeam;
        }

        Team winner = (winningTeam == 1) ? team1 : team2;
        return winner;
    }

    /*****************************
     * simulateRound(): simulates all matches in a tournament round
     * (QF, SF, etc.) until a user game is played. Returns an array
     * for the matches for next round.
     */
    public static Team[] simulateRound(Team[] currentRound) 
    {
        Team[] nextRound = new Team[currentRound.length / 2];
        int userTeamIndex = 0;
        // TODO: simulate games and add them to arraylist as long as there user matches
        // are not simulated
        for (int i = 0; i < currentRound.length; i+=2)
        {
            // check if user team is being accidentally simulated. if so, skip the simulation
            /* 
            if (currentRound[i].getName().equals(Main.userTeam.getName()))
            {
                userTeamIndex = i;
                continue;
            }
            else if (currentRound[i+1].getName().equals(Main.userTeam.getName()))
            {
                userTeamIndex = i+1;
                continue;
            }
                */
            // simulate round between computers
            nextRound[i/2] = simulateMatch(currentRound[i], currentRound[i+1]);
        }

        // play out user match
        //nextRound[userTeamIndex/2] = Match.playMatch(Main.userTeam, 
        //                (userTeamIndex%2==0) ? currentRound[userTeamIndex + 1] : currentRound[userTeamIndex - 1]); // index of opponent team
        return nextRound;
    }

    /*****************************
     * displayBracket(): displays progress of tournament brackets
     * starting from R16
     */
    public static void displayBracket() 
    {
        // display R16 matches one by one
        System.out.printf("\n--------------------------- ROUND OF 16 ---------------------------\n\n");
        for (int i = 0; i < 16; i+=2)
        {
            System.out.printf("%s vs %s. %n", Main.R16[i].getName(), Main.R16[i+1].getName());
        }

        // display QF matches if they've been decided
        if (Main.QF[0] != null)
        {
            System.out.printf("\n--------------------------- QUARTER-FINALS ---------------------------\n\n");
            for (int i = 0; i < 8; i+=2)
            {
                System.out.printf("%s vs %s. %n", Main.QF[i].getName(), Main.QF[i+1].getName());
            }

            // display SF matches if they've been decided
            if (Main.SF[0] != null)
            {
                System.out.printf("\n--------------------------- SEMI-FINALS ---------------------------\n\n");
                for (int i = 0; i < 4; i+=2)
                {
                    System.out.printf("%s vs %s. %n", Main.SF[i].getName(), Main.SF[i+1].getName());
                }

                // display finals if it's been decided
                if (Main.FINALS[0] != null)
                {
                    System.out.printf("\n--------------------------- FINALS ---------------------------\n\n");
                    for (int i = 0; i < 2; i+=2)
                    {
                        System.out.printf("%s vs %s. %n", Main.FINALS[i].getName(), Main.FINALS[i+1].getName());
                    }
                }
            }
        }
    }

    /******************************
     * displayStats(): ranks the top wicket takers and run scorers
     * from a team.
     */
    public static void displayStats(Team team) 
    {
        ArrayList<Player> players = team.getTeam();

        System.out.println("====================== BOWLING STATS (TOURNAMENT) ======================");
        System.out.printf("%n%-5s%-35s%-10s%-12s%-12s", "No.", "Name", "Wickets", "Bowling %", "Overall %");
        for (int i = 0; i < players.size(); i++)
        {
            System.out.printf("%n%-5s%-35s%-10s%-12s%-12s", i+1, players.get(i).getName(), players.get(i).getWicketsTaken(),
                players.get(i).getBowlingRating(), players.get(i).getOverallRating());
        }
        System.out.println();
        Utilities.inputString("Press the enter key to continue> ");

        System.out.println("\n\n\n");
        System.out.println("====================== BATTING STATS (TOURNAMENT) ======================");
        System.out.printf("%n%-5s%-35s%-10s%-12s%-12s", "No.", "Name", "Runs Sco.", "Batting %", "Overall %");
        for (int i = 0; i < players.size(); i++)
        {
            System.out.printf("%n%-5s%-35s%-10s%-12s%-12s", i+1, players.get(i).getName(), players.get(i).getRunsScored(),
                players.get(i).getBattingRating(), players.get(i).getOverallRating());
        }
        System.out.println();
        Utilities.inputString("Press the enter key to continue> ");
        System.out.println("\n\n\n");
    }

}