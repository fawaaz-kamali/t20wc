/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import java.util.ArrayList;

import main.players.Player;
import main.players.usa.*;


public class USA extends Team
{
    public USA()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("USA");
        // instantiating players
        player1 = new MonankPatel();       
        player2 = new AaronJones();      
        player3 = new StevenTaylor();
        player4 = new CoreyAnderson();
        player5 = new SaurabhNetravalkar();
        player6 = new JessySingh();
        player7 = new HarmeetSingh();
        player8 = new NoshtushKenjige();
        player9 = new ShadleyVanSchalkwyk();
        player10 = new NitishKumar();
        player11 = new AliKhan();
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