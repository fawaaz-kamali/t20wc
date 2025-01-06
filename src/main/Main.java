/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      17 July 2024
 * @description     
 * 
 * 
 * 
**********************************/
package main;
import main.teams.*;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

import main.Match;

public class Main
{

    // instances for all teams
    static Team afghanistan = new Afghanistan();
    static Team australia = new Australia();
    static Team bangladesh = new Bangladesh();
    static Team canada = new Canada();
    static Team england = new England();
    static Team india = new India();
    static Team ireland = new Ireland();
    static Team nepal = new Nepal();
    static Team netherlands = new Netherlands();
    static Team newzealand = new NewZealand();
    static Team pakistan = new Pakistan();
    static Team scotland = new Scotland();
    static Team southafrica = new SouthAfrica();
    static Team srilanka = new SriLanka();
    static Team usa = new USA();
    static Team westindies = new WestIndies();

    static Team userTeam;

    static Team[] R16 = {afghanistan, australia, bangladesh, canada, england, india, ireland, 
        nepal, netherlands, newzealand, pakistan, scotland, southafrica, srilanka, usa, westindies
    };
    // static Team[] R16 = new Team[16];
    static Team[] QF = new Team[8];
    static Team[] SF = new Team[4];
    static Team[] FINALS = new Team[2];
    static Team[] WINNER = new Team[1];

    static int currentRound = 1; // 1 = R16, 2 = QF, 3 = SF, 4 = FINALS, 5 = Tournament over

    private static Team[] getRound(int round)
    {
        if (round == 1)
        {
            return R16;
        }
        else if (round == 2)
        {
            return QF;
        }
        else if (round == 3)
        {
            return SF;
        }
        else if (round == 4)
        {
            return FINALS;
        }
        return WINNER;
    }

    public static void main(String[] args) throws FileNotFoundException
    {

        // Instantiation and variable declarations
        Scanner userInput = new Scanner(System.in);
        String menu = "";

        // loadProgress
        Utilities.loadProgress();
        
        // if there is no user team, ask user to select team
        if (userTeam != null)
        {
            System.out.println(); // newline
            for (int i = 0; i < R16.length; i++)
            {
                System.out.printf("%-4s%-20s%-10s%n", "No.", "Team", "Rating");
            }
            int choice = Utilities.inputInt("Choose your team no.: ", 1, R16.length);
            userTeam = R16[choice - 1];
        }


        // MAIN MENU

        do
        {
            // Get opponent based on current round
            int userIndex = 0;
            for (int i = 0; i < getRound(currentRound).length; i++)
            {
                if (getRound(currentRound)[i].getName().equals(userTeam.getName()))
                {
                    userIndex = i;
                    break;
                }
            }
            Team opponent = (userIndex%2==0) ? getRound(currentRound)[userIndex + 1] : getRound(currentRound)[userIndex - 1];

            System.out.println("\n\n"); // 3 newlines
            System.out.println("=================================================");
            System.out.println("Location: USA / West Indies");
            System.out.printf("Current Team: %s%n", userTeam.getName());
            System.out.println("=================================================");
            System.out.println("Enter the menu option:");
            System.out.printf("1. Play next match (%s)%n", opponent.getName());
            System.out.println("2. Display Tournament Bracket");
            System.out.println("3. View Team Lineup");
            System.out.println("4. View Statistics");
            System.out.println("5. Save Progress and Exit Program");
            System.out.println("6. Forfeit Tournament");
            menu = Utilities.inputString("> ");

            switch (menu)
            {
                // 1. Play next match (opponent)
                // will simulate entire round, and then plays the user match 
                // if user wins, they advance to next round
                // if user loses, the remaining tournament is simulated and the program ends
                case "1":
                    // TODO
                    // Team[] nextRound = getRound(currentRound + 1);
                    // nextRound = Tournament.simulateRound(getRound(currentRound));
                    Team[] nextRound = Tournament.simulateRound(getRound(currentRound));
                    // check if user team makes it to next round
                    userIndex = -1;
                    for (int i = 0; i < nextRound.length; i++)
                    {
                        if (nextRound[i].getName().equals(userTeam.getName()))
                        {
                            userIndex = i;
                            break;
                        }
                    }
                    currentRound ++;
                    // if loser does not make it to next round
                    if (userIndex == -1)
                    {
                        // simulate remaining tournament while waiting for prompt and display overall bracket
                    }
                    else
                    {
                        // tell user they made it to next round. if they won the finals, print out a message saying they won the tournament.
                    }
                    break;
                
                // 2. Displays tournament bracket
                case "2":
                    Tournament.displayBracket();
                    break;

                // 3. View Team Lineup
                case "3":
                    System.out.println("\n\n");
                    System.out.printf("%-5s%-40s%-10s%-10s %-10s%n", "No.", "Name","Overall %", "Bowling %", "Batting %");
                    for (int i = 0; i < userTeam.getTeam().size(); i++)
                    {
                        System.out.printf("%-5s%-40s%-10s%-10s %-10s%n", i+1, userTeam.getTeam().get(i).getName(), 
                            userTeam.getTeam().get(i).getOverallRating(), userTeam.getTeam().get(i).getBowlingRating(), userTeam.getTeam().get(i).getBattingRating());
                    }
                    Utilities.inputString("Press the enter key to continue> ");
                    break;

                // 4. View Team Statistics
                case "4":
                    Tournament.displayStats(userTeam);
                    break;

                // 5. Save Progress and Exit Program
                case "5":
                    Utilities.saveProgress();
                    break;

                // 6. Forfeit Tournament
                case "6":
                    // delete and recreate file
                    String fileName = "progress.txt";
                    File file = new File(fileName);
                    try 
                    {
                        // Delete the file if it exists
                        if (file.exists()) {
                            if (file.delete()) {
                                System.out.println("File deleted: " + fileName);
                            } else {
                                System.out.println("Failed to delete the file: " + fileName);
                            }
                        }
            
                        // Create a new file
                        if (file.createNewFile()) {
                            System.out.println("New file created: " + fileName);
                        } else {
                            System.out.println("File already exists: " + fileName);
                        }
                    } 
                    catch (IOException e) 
                    {
                        System.out.println("An error occurred: " + e.getMessage());
                    }
                    break;
                
                default:
                    System.out.println("Enter a valid option.");
            }
            

        } while((currentRound < 5) && (!menu.equals("5") || !menu.equals("6"))); // modify condition later on

    }
}