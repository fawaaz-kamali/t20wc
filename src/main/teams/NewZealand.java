/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import main.players.newzealand.*;


public class NewZealand extends Team
{
    public NewZealand()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("New Zealand");
        // instantiating players
        player1 = new KaneWilliamson();       
        player2 = new FinnAllen();      
        player3 = new DevonConway();
        player4 = new GlennPhillips();
        player5 = new MarkChapman();
        player6 = new MitchellSantner();
        player7 = new DarylMitchell();
        player8 = new MichaelBracewell();
        player9 = new TimSouthee();
        player10 = new LockieFerguson();
        player11 = new TrentBoult();
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