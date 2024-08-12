/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import java.util.ArrayList;

import main.players.Player;
import main.players.canada.*;


public class Canada extends Team
{
    public Canada()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("Canada");
        // instantiating players
        player1 = new SaadBinZafar();       
        player2 = new AaronJohnson();      
        player3 = new ShreyasMovva();
        player4 = new DillonHeyliger();
        player5 = new KaleemSana();
        player6 = new PargatSingh();
        player7 = new NicholasKirton();
        player8 = new NavneetDhaliwal();
        player9 = new NikhilDutta();
        player10 = new JeremyGordon();
        player11 = new JunaidSiddiqui();
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