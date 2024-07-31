/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import main.players.ireland.*;


public class Ireland extends Team
{
    public Ireland()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("Ireland");
        // instantiating players
        player1 = new PaulStirling();       
        player2 = new AndrewBalbirnie();      
        player3 = new BenWhite();
        player4 = new CurtisCampher();
        player5 = new GarethDelany();
        player6 = new GeorgeDockrell();
        player7 = new HarryTector();
        player8 = new JoshLittle();
        player9 = new LorcanTucker();
        player10 = new MarkAdair();
        player11 = new BarryMcCarthy();
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