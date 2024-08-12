/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import java.util.ArrayList;

import main.players.Player;
import main.players.westindies.*;


public class WestIndies extends Team
{
    public WestIndies()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("West Indies");
        // instantiating players
        player1 = new RovmanPowell();       
        player2 = new ShaiHope();      
        player3 = new RostonChase();
        player4 = new JohnsonCharles();
        player5 = new NicholasPooran();
        player6 = new ShimronHetmyer();
        player7 = new JasonHolder();
        player8 = new AndreRussell();
        player9 = new AlzarriJoseph();
        player10 = new AkealHosein();
        player11 = new ObedMcCoy();
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