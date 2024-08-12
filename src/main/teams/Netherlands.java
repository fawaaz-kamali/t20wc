/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import java.util.ArrayList;

import main.players.Player;
import main.players.netherlands.*;


public class Netherlands extends Team
{
    public Netherlands()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("Netherlands");
        // instantiating players
        player1 = new ScottEdwards();       
        player2 = new LoganVanBeek();      
        player3 = new AryanDutt();
        player4 = new SybrandEngelbrecht();
        player5 = new BasDeLeede();
        player6 = new MichaelLevitt();
        player7 = new PaulVanMeekeren();
        player8 = new MaxODowd();
        player9 = new TimPringle();
        player10 = new VikramSingh();
        player11 = new VivianKingma();
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