/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      1 August 2024
 * @description     Contains methods that are
 *                  used throughout the program 
 *                  in various applications such as
 * 
 *                  inputInt(prompt, min, max)
 *                  inputString(prompt)
 *                  slowPrint(prompt, delay)
 * 
 * 
 * 
**********************************/
package main;

import main.players.Player;
import main.teams.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Utilities
{
    /********************
     * inputInt(): repeatedly asks user for input until an acceptable
     * answer within range is entered.
     */
    public static int inputInt(String prompt, int min, int max)
    {
        Scanner uI = new Scanner(System.in);
        int input;

        System.out.print(prompt);
        do 
        {
            // If the user does not input an int then you loop until they input an integer.
            while (!uI.hasNextInt()) 
            {
                System.out.println("Please enter a valid integer. ");
                System.out.print(prompt);
                uI.nextLine();
            }
            input = uI.nextInt();

            // Check if the input value is higher then max or lower than min. If so, loop
            // until input is lower then max and higher then min
            if (input < min || input > max) 
            {
                System.out.println("Please enter a valid integer within range");
                System.out.print(prompt);
                uI.nextLine();
            }

        } while (input < min || input > max); // Continously loop until user inputs correctly
    
        return input;
    }


    /*********************
     * inputString(): simpler method used to input a string from user
     */
    public static String inputString(String prompt)
    {
        Scanner uI = new Scanner(System.in);
        String input = "";
        System.out.print(prompt);
        input = uI.nextLine();
        return input;
    }

    /*********************
     * slowPrint(): used for a realistic effect within the game. Slightly
     * delays print of each character in a string prompt.
     * delay must be 25 for wickets/boundaries 
     *               40 for prematch commentary
     */
    public static void slowPrint(String prompt, long delay)
    {
        // Loop through each character in the text
        for (int i = 0; i < prompt.length(); i++) 
        {
            // Print the current character
            System.out.print(prompt.charAt(i));
            try {
                // Pause for the specified delay
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                // If interrupted while sleeping, print the stack trace
                e.printStackTrace();
            }
        }
    }

    public static ArrayList<Player> copyList(ArrayList<Player> list)
    {
        ArrayList<Player> duplicate = new ArrayList<>();
        for (int i = 0; i < list.size(); i++)
        {
            duplicate.add(list.get(i));
        }
        return duplicate;
    }

    /*********************
     * mapTeam(): used for mapping a name to an object.
     */
    public static Team mapTeam(String name)
    {
        Team[] teams = {new Afghanistan(), 
                        new Australia(), 
                        new Bangladesh(), 
                        new Canada(), 
                        new England(), 
                        new India(), 
                        new Ireland(), 
                        new Nepal(), 
                        new Netherlands(), 
                        new NewZealand(), 
                        new Pakistan(), 
                        new Scotland(), 
                        new SouthAfrica(), 
                        new SriLanka(), 
                        new USA(), 
                        new WestIndies(),
                    };
        // Team team = null;
        for (int i = 0; i < teams.length; i++)
        {
            if (teams[i].getName().equals(name))
            {
                return teams[i];
            }
        }
        return null;
    }

    /*********************
     * loadProgress(): used at the beginning of the program to load
     * saved progress
     */
    public static void loadProgress()
    {
        try 
        {
            File fileName = new File("src\\main\\progress.txt");
            Scanner diskScanner = new Scanner(fileName);
            diskScanner.useDelimiter(",|\\n");

            // First line stores R16
            if (diskScanner.hasNextLine())
            {
                for (int i = 0; i < Main.R16.length; i++)
                {
                    Main.R16[i] = mapTeam(diskScanner.next());
                }
                diskScanner.nextLine(); // contents of row are read
            }

            // Second line stores QF
            if (diskScanner.hasNextLine())
            {
                for (int i = 0; i < Main.R16.length; i+=2)
                {
                    String teamName = diskScanner.next();
                    if (!teamName.equals("null"))
                    {
                        Main.QF[i/2] = (Main.R16[i].getName().equals(teamName)) ? Main.R16[i] : Main.R16[i+1];
                    }
                }
                diskScanner.nextLine(); // contents of row are read
            }

            // Third line stores SF
            if (diskScanner.hasNextLine())
            {
                for (int i = 0; i < Main.QF.length; i+=2)
                {
                    String teamName = diskScanner.next();
                    if (!teamName.equals("null"))
                    {
                        Main.SF[i/2] = (Main.QF[i].getName().equals(teamName)) ? Main.QF[i] : Main.QF[i+1];
                    }
                }
                diskScanner.nextLine(); // contents of row are read
            }

            // Fourth line stores FINALS
            if (diskScanner.hasNextLine())
            {
                for (int i = 0; i < Main.SF.length; i+=2)
                {
                    String teamName = diskScanner.next();
                    if (!teamName.equals("null"))
                    {
                        Main.FINALS[i/2] = (Main.SF[i].getName().equals(teamName)) ? Main.SF[i] : Main.SF[i+1];
                    }
                }
                diskScanner.nextLine(); // contents of row are read
            }

            // Fifth line assigns user team
            if (diskScanner.hasNextLine())
            {
                Main.userTeam = mapTeam(diskScanner.next());
                diskScanner.nextLine(); // contents of row are read
            }

            // Remaining Lines store individual player stats in order
            // Runs Scored, Wickets
            // for (int i = 0; i < Main.userTeam.getTeam().size(); i++)
            // {
            //     if (diskScanner.hasNextLine())
            //     {
            //         Main.userTeam.getTeam().get(i).setRunsScored(Integer.parseInt(diskScanner.next()));     // Set runs scored
            //         Main.userTeam.getTeam().get(i).setWicketsTaken(Integer.parseInt(diskScanner.next()));   // Set wickets taken
            //         diskScanner.nextLine();
            //     }
            // }
            diskScanner.close();
        }
        catch (FileNotFoundException e) 
        {
            System.err.println(e);
        }
    }

    /**************************
     * saveProgress(): used at the end of the program to save 
     * current progress
     */
    public static void saveProgress() throws FileNotFoundException
    {
        String fileContent = "";
        PrintWriter diskWriter = new PrintWriter("src\\main\\progress.txt");

        // Write R16
        for (int i = 0; i < Main.R16.length; i++)
        {
            if (Main.R16[i] != null)
            {
                fileContent += Main.R16[i].getName();
            }
            else 
            {
                fileContent += "null";
            }
            fileContent += ",";
        }
        fileContent += "\n";

        // Write QF
        for (int i = 0; i < Main.QF.length; i++)
        {
            if (Main.QF[i] != null)
            {
                fileContent += Main.QF[i].getName();
            }
            else 
            {
                fileContent += "null";
            }
            fileContent += ",";
        }
        fileContent += "\n";

        // Write SF
        for (int i = 0; i < Main.SF.length; i++)
        {
            if (Main.SF[i] != null)
            {
                fileContent += Main.SF[i].getName();
            }
            else 
            {
                fileContent += "null";
            }
            fileContent += ",";
        }
        fileContent += "\n";

        // Write Finals
        for (int i = 0; i < Main.FINALS.length; i++)
        {
            if (Main.FINALS[i] != null)
            {
                fileContent += Main.FINALS[i].getName();
            }
            else 
            {
                fileContent += "null";
            }
            fileContent += ",";
        }
        fileContent += "\n";

        // Write user team
        fileContent += Main.userTeam.getName();
        fileContent += ",\n";

        // Write individual statistics
        for (int i = 0; i < Main.userTeam.getTeam().size(); i++)
        {
            fileContent += Main.userTeam.getTeam().get(i).getRunsScored();
            fileContent += ",";
            fileContent += Main.userTeam.getTeam().get(i).getWicketsTaken();
            fileContent += ",\n";
        }

        diskWriter.print(fileContent);
        diskWriter.close();
    }
}