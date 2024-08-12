/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import java.util.ArrayList;

import main.players.Player;
import main.players.india.*;


public class India extends Team
{
    public India()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("India");
        // instantiating players
        player1 = new RohitSharma();       
        player2 = new YashasviJaiswal();      
        player3 = new ViratKohli();
        player4 = new SuryakumarYadav();
        player5 = new RishabhPant();
        player6 = new HardikPandya();
        player7 = new RavindraJadeja();
        player8 = new KuldeepYadav();
        player9 = new JaspritBumrah();
        player10 = new ArshdeepSingh();
        player11 = new MohammadSiraj();
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