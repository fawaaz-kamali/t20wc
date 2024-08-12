/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import main.players.australia.*;

import java.util.ArrayList;
import main.players.Player;


public class Australia extends Team
{
    public Australia()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("Australia");
        // instantiating players
        player1 = new DavidWarner();       
        player2 = new MitchellMarsh();      
        player3 = new MarcusStoinis();
        player4 = new GlennMaxwell();
        player5 = new TravisHead();
        player6 = new MatthewWade();
        player7 = new PatCummins();
        player8 = new JoshHazelwood();
        player9 = new MitchellStarc();
        player10 = new AdamZampa();
        player11 = new AshtonAgar();
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