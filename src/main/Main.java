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

    public static void main(String[] args)
    {
        Team[] teams = {afghanistan, australia, bangladesh, canada, england, india, ireland, 
            nepal, netherlands, newzealand, pakistan, scotland, southafrica, srilanka, usa, westindies};

        for (int i = 0; i < teams.length; i++)
        {
            System.out.printf("TEAM: %s%n", teams[i].getName());
            System.out.printf("%-40s%-10s%-10s%-10s%n", "Name", "Batting", "Bowling", "Overall");
            for (int j = 0; j < 11; j++)
            {
                String playerName = teams[i].getTeam().get(j).getName();
                int bat = teams[i].getTeam().get(j).getBattingRating();
                int bowl = teams[i].getTeam().get(j).getBowlingRating();
                int over = teams[i].getTeam().get(j).getOverallRating();
                System.out.printf("%-40s%-10s%-10s%-10s%n", playerName, bat, bowl, over);
            }
            System.out.println(); // newline
        }
    }
}