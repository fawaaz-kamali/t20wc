/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import java.util.ArrayList;

import main.players.Player;
import main.players.bangladesh.*;


public class Bangladesh extends Team
{
    public Bangladesh()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("Bangladesh");
        // instantiating players
        player1 = new NajmulHossainShanto();       
        player2 = new TanzidHasan();      
        player3 = new TowhidHridoy();
        player4 = new MahediHasan();
        player5 = new Mahmudullah();
        player6 = new ShakibAlHasan();
        player7 = new SoumyaSarkar();
        player8 = new LittonDas();
        player9 = new RishadHossain();
        player10 = new TanzimHasanSakib();
        player11 = new TaskinAhmed();
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