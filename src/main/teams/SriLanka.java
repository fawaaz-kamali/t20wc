/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import java.util.ArrayList;

import main.players.Player;
import main.players.srilanka.*;


public class SriLanka extends Team
{
    public SriLanka()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("Sri Lanka");
        // instantiating players
        player1 = new WaninduHasaranga();       
        player2 = new PathumNissanka();      
        player3 = new KusalMendis();
        player4 = new CharithAsalanka();
        player5 = new DhananjayaDeSilva();
        player6 = new DasunShanaka();
        player7 = new MatheeshaPathirana();
        player8 = new MaheeshTheekshana();
        player9 = new DilshanMadushanka();
        player10 = new KasunRajitha();
        player11 = new LahiruKumara();
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