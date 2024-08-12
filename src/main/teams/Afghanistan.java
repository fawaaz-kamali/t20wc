/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import java.util.ArrayList;

import main.players.Player;
import main.players.afghanistan.*;


public class Afghanistan extends Team
{
    public Afghanistan()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("Afghanistan");
        // instantiating players
        player1 = new RashidKhan();       
        player2 = new RahmanullahGurbaz();      
        player3 = new IbrahimZadran();
        player4 = new AzmatullahOmarzai();
        player5 = new NajibullahZadran();
        player6 = new MohammadNabi();
        player7 = new GulbadinNaib();
        player8 = new MujeebUrRahman();
        player9 = new NaveenUlHaq();
        player10 = new FazalhaqFarooqi();
        player11 = new MohammadIshaq();
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