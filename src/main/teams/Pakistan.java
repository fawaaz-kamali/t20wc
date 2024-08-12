/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import java.util.ArrayList;

import main.players.Player;
import main.players.pakistan.*;


public class Pakistan extends Team
{
    public Pakistan()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("Pakistan");
        // instantiating players
        player1 = new BabarAzam();       
        player2 = new MohammadRizwan();      
        player3 = new FakharZaman();
        player4 = new SaimAyub();
        player5 = new IftikharAhmed();
        player6 = new ShadabKhan();
        player7 = new ImadWasim();
        player8 = new ShaheenAfridi();
        player9 = new NaseemShah();
        player10 = new HarisRauf();
        player11 = new MohammadAmir();
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