/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import main.players.scotland.*;


public class Scotland extends Team
{
    public Scotland()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("Scotland");
        // instantiating players
        player1 = new RichieBerrington();       
        player2 = new MatthewCross();      
        player3 = new BradleyCurrie();
        player4 = new ChrisGreaves();
        player5 = new MichaelJones();
        player6 = new MichaelLeask();
        player7 = new BrandonMcMullen();
        player8 = new GeorgeMunsey();
        player9 = new SafyaanSharif();
        player10 = new ChrisSole();
        player11 = new MarkWatt();
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