/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import java.util.ArrayList;

import main.players.Player;
import main.players.ireland.*;


public class Ireland extends Team
{
    public Ireland()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("Ireland");
        // instantiating players
        player1 = new PaulStirling();       
        player2 = new AndrewBalbirnie();      
        player3 = new BenWhite();
        player4 = new CurtisCampher();
        player5 = new GarethDelany();
        player6 = new GeorgeDockrell();
        player7 = new HarryTector();
        player8 = new JoshLittle();
        player9 = new LorcanTucker();
        player10 = new MarkAdair();
        player11 = new BarryMcCarthy();
        // add players to team
        ArrayList<Player> t = new ArrayList();
        t.add(player1);
        t.add(player2);
        t.add(player3);
        t.add(player4);
        t.add(player5);
        t.add(player6);
        t.add(player7);
        t.add(player8);
        t.add(player9);
        t.add(player10);
        t.add(player11);
        this.setTeam(t);
        // calculate team overall rating
        int sum = 0;
        double overall = 0;
        for (int i = 0; i < this.team.size(); i++)
        {
            sum += this.team.get(i).getOverallRating();
        }
        overall = sum / 11.0;
        this.setOverallRating(overall);

    }
}