/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import java.util.ArrayList;

import main.players.Player;
import main.players.nepal.*;


public class Nepal extends Team
{
    public Nepal()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("Nepal");
        // instantiating players
        player1 = new RohitPaudel();       
        player2 = new AasifSheikh();      
        player3 = new AnilKumarSah();
        player4 = new KushalBhurtel();
        player5 = new KushalMalla();
        player6 = new DipendraSinghAiree();
        player7 = new LalitRajbanshi();
        player8 = new GulshanJha();
        player9 = new SompalKami();
        player10 = new SundeepJora();
        player11 = new AbinashBohara();
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