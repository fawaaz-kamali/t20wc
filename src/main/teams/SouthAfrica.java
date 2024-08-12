/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import java.util.ArrayList;

import main.players.Player;
import main.players.southafrica.*;


public class SouthAfrica extends Team
{
    public SouthAfrica()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("South Africa");
        // instantiating players
        player1 = new QuintonDeKock();       
        player2 = new ReezaHendricks();      
        player3 = new AidenMarkram();
        player4 = new TristanStubbs();
        player5 = new HeinrichKlaasen();
        player6 = new DavidMiller();
        player7 = new MarcoJansen();
        player8 = new KeshavMaharaj();
        player9 = new KagisoRabada();
        player10 = new AnrichNortje();
        player11 = new TabraizShamsi();
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