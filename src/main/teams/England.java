/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import java.util.ArrayList;

import main.players.Player;
import main.players.england.*;


public class England extends Team
{
    public England()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("England");
        // instantiating players
        player1 = new JosButtler();       
        player2 = new PhilSalt();      
        player3 = new JonnyBairstow();
        player4 = new BenStokes();
        player5 = new HarryBrook();
        player6 = new MoeenAli();
        player7 = new ChrisJordan();
        player8 = new MarkWood();
        player9 = new AdilRashid();
        player10 = new JofraArcher();
        player11 = new ReeceTopley();
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