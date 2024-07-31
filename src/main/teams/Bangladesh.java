/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import main.players.bangladesh.*;


public class Bangladesh extends Team
{
    public Bangladesh()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("Bangladesh");
        // instantiating players
        player1 = new NajmulHossainShanto();       
        player2 = new TanzidHasan();      
        player3 = new TowhidHridoy();
        player4 = new MahediHasan();
        player5 = new Mahmudullah();
        player6 = new ShakibAlHasan();
        player7 = new SoumyaSarkar();
        player8 = new LittonDas();
        player9 = new RishadHossain();
        player10 = new TanzimHasanSakib();
        player11 = new TaskinAhmed();
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