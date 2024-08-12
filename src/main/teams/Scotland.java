/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import java.util.ArrayList;

import main.players.Player;
import main.players.scotland.*;


public class Scotland extends Team
{
    public Scotland()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("Scotland");
        // instantiating players
        player1 = new RichieBerrington();       
        player2 = new MatthewCross();      
        player3 = new BradleyCurrie();
        player4 = new ChrisGreaves();
        player5 = new MichaelJones();
        player6 = new MichaelLeask();
        player7 = new BrandonMcMullen();
        player8 = new GeorgeMunsey();
        player9 = new SafyaanSharif();
        player10 = new ChrisSole();
        player11 = new MarkWatt();
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