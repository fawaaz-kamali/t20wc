/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import main.players.england.*;


public class England extends Team
{
    public England()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("England");
        // instantiating players
        player1 = new JosButtler();       
        player2 = new PhilSalt();      
        player3 = new JonnyBairstow();
        player4 = new BenStokes();
        player5 = new HarryBrook();
        player6 = new MoeenAli();
        player7 = new ChrisJordan();
        player8 = new MarkWood();
        player9 = new AdilRashid();
        player10 = new JofraArcher();
        player11 = new ReeceTopley();
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