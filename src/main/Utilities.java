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

import java.util.Scanner;

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

}