/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
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
        this.team.add(player1);
        this.team.add(player2);
        this.team.add(player3);
        this.team.add(player4);
        this.team.add(player5);
        this.team.add(player6);
        this.team.add(player7);
        this.team.add(player8);
        this.team.add(player9);
        this.team.add(player10);
        this.team.add(player11);
        this.setTeam(this.team);
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