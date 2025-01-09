/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      9 January 2025
 * @description     Main class of program with which
 *                  game is run. All classes are combined
 *                  together and work here.
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

    static boolean isTournamentOver;

    static Team[] R16 = {afghanistan, australia, bangladesh, canada, england, ireland, india, 
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

    private static void forfeit()
    {
        // delete and recreate file
        String fileName = "src\\main\\progress.txt";
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

            System.out.println("\n\n");
            System.out.println("It was nice playing with you. Goodbye!");
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws FileNotFoundException
    {

        // Instantiation and variable declarations
        Scanner userInput = new Scanner(System.in);
        String menu = "";

        // loadProgress
        Utilities.loadProgress();
        
        // assign currentRound variable
        if (QF[0] == null)
        {
            currentRound = 1;
        }
        else if (SF[0] == null)
        {
            currentRound = 2;
        }
        else if (FINALS[0] == null)
        {
            currentRound = 3;
        }
        else if (WINNER[0] == null)
        {
            currentRound = 4;
        }
        
        // if there is no user team, ask user to select team
        if (userTeam == null)
        {
            System.out.println(); // newline
            System.out.printf("%-4s%-20s%-10s%n", "No.", "Team", "Rating");
            for (int i = 0; i < R16.length; i++)
            {
                System.out.printf("%-4s%-20s%-10.3f%n", i+1, R16[i].getName(), R16[i].getOverallRating());
            }
            int choice = Utilities.inputInt("Choose your team no.: ", 1, R16.length);
            userTeam = R16[choice - 1];
        }


        // MAIN MENU

        do
        {
            // Get opponent based on current round
            Team[] currentKnockout = getRound(currentRound);
            int userIndex = 0;
            for (int i = 0; i < currentKnockout.length; i++)
            {
                if (currentKnockout[i].getName().equals(userTeam.getName()))
                {
                    userIndex = i;
                    break;
                }
            }
            Team opponent = (userIndex%2==0) ? currentKnockout[userIndex + 1] : currentKnockout[userIndex - 1];

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
                    Team[] nextKnockout = getRound(currentRound + 1);
                    // nextRound = Tournament.simulateRound(getRound(currentRound));
                    // Team[] nextKnockout = new Team[currentKnockout.length / 2];
                    nextKnockout = Tournament.simulateRound(currentKnockout);
                    // check if user team makes it to next round
                    userIndex = -1;
                    for (int i = 0; i < nextKnockout.length; i++)
                    {
                        if (nextKnockout[i].getName().equals(userTeam.getName()))
                        {
                            userIndex = i;
                            break;
                        }
                    }
                    currentRound ++;

                    // copy nextKnockout into official array
                    if (currentRound == 2)
                    {
                        Utilities.copyArray(nextKnockout, QF);
                    }
                    else if (currentRound == 3)
                    {
                        Utilities.copyArray(nextKnockout, SF);
                    }
                    else if (currentRound == 4)
                    {
                        Utilities.copyArray(nextKnockout, FINALS);
                    }
                    else if (currentRound == 5)
                    {
                        Utilities.copyArray(nextKnockout, WINNER);
                    }

                    // if user does not make it to next round
                    if (userIndex == -1)
                    {
                        // simulate remaining tournament while waiting for prompt and display overall bracket
                        System.out.println("\n\n");
                        System.out.printf("%s have been eliminated.%n", userTeam.getName());
                        Utilities.inputString("Press the enter key to view final statistics> ");
                        Tournament.displayStats(userTeam);

                        Utilities.inputString("Press the enter key to finish tournament> ");
                        
                        while (currentRound < 5)
                        {
                            // copy nextKnockout into official array
                            if (currentRound == 2)
                            {
                                Utilities.copyArray(nextKnockout, QF);
                            }
                            else if (currentRound == 3)
                            {
                                Utilities.copyArray(nextKnockout, SF);
                            }
                            else if (currentRound == 4)
                            {
                                Utilities.copyArray(nextKnockout, FINALS);
                            }
                            nextKnockout = Tournament.simulateRound(getRound(currentRound));
                            currentRound ++;
                        }
                        if (!userTeam.getName().equals(FINALS[0].getName()) && !userTeam.getName().equals(FINALS[1].getName()))
                        {
                            WINNER[0] = Tournament.simulateMatch(FINALS[0], FINALS[1]);
                        }
                        Tournament.displayBracket();
                        System.out.printf("%s have been crowned the 2024 T10 World Cup Champions.%n", WINNER[0].getName());
                        Utilities.inputString("Press the enter key to quit> ");
                        forfeit();
                        isTournamentOver = true;
                    }
                    else
                    {
                        // tell user they made it to next round. if they won the finals, print out a message saying they won the tournament.
                        System.out.println("\n\n");
                        if (currentRound <= 4)
                        {
                            System.out.printf("%s have advanced to the next round.%n", userTeam.getName());
                            Utilities.inputString("Press the enter key to continue> ");
                        }
                        else
                        {
                            Utilities.slowPrint("And yet another historic World Cup comes to a thrilling end.\n", 40);
                            Utilities.slowPrint(userTeam.getName() + " have been crowned champions of the world following a fantastic contest in the finals.\n", 40);
                            System.out.println("\n\n");
                            Utilities.inputString("Press the enter key to exit> ");
                            isTournamentOver = true;
                            forfeit();
                        }
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
                    // double ask user
                    String confirm = Utilities.inputString("WARNING: All progress will be lost. (g)o back or (p)roceed: ");
                    if (confirm.toLowerCase().equals("p"))
                    {
                        forfeit();
                        isTournamentOver = true;
                    }
                    break;
                
                default:
                    System.out.println("Enter a valid option.");
            }
            

        } while(currentRound < 5 && (!menu.equals("5") && !isTournamentOver)); // modify condition later on

        userInput.close();
    }
}