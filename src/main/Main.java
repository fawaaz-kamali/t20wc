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
    static Team[] QF = new Team[8];
    static Team[] SF = new Team[4];
    static Team[] FINALS = new Team[2];

    public static void main(String[] args)
    {
        // Team[] teams = {afghanistan, australia, bangladesh, canada, england, india, ireland, 
        //     nepal, netherlands, newzealand, pakistan, scotland, southafrica, srilanka, usa, westindies};

        // for (int i = 0; i < teams.length; i++)
        // {
        //     System.out.printf("TEAM: %s%n", teams[i].getName());
        //     System.out.printf("%-40s%-10s%-10s%-10s%n", "Name", "Batting", "Bowling", "Overall");
        //     for (int j = 0; j < 11; j++)
        //     {
        //         String playerName = teams[i].getTeam().get(j).getName();
        //         int bat = teams[i].getTeam().get(j).getBattingRating();
        //         int bowl = teams[i].getTeam().get(j).getBowlingRating();
        //         int over = teams[i].getTeam().get(j).getOverallRating();
        //         System.out.printf("%-40s%-10s%-10s%-10s%n", playerName, bat, bowl, over);
        //     }
        //     System.out.println(); // newline
        // }
        // Match.playMatch(india, australia);
        Tournament.displayBracket();
        // System.out.println(QF[0].getName());

        QF = Tournament.simulateRound(R16);
        SF = Tournament.simulateRound(QF);
        FINALS = Tournament.simulateRound(SF);

        Tournament.displayBracket();
        System.out.printf("The winner is %s.%n", Tournament.simulateMatch(FINALS[0], FINALS[1]).getName());
    }
}