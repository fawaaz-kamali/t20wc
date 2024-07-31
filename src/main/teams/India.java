/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import main.players.india.*;


public class India extends Team
{
    public India()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("India");
        // instantiating players
        player1 = new RohitSharma();       
        player2 = new YashasviJaiswal();      
        player3 = new ViratKohli();
        player4 = new SuryakumarYadav();
        player5 = new RishabhPant();
        player6 = new HardikPandya();
        player7 = new RavindraJadeja();
        player8 = new KuldeepYadav();
        player9 = new JaspritBumrah();
        player10 = new ArshdeepSingh();
        player11 = new MohammadSiraj();
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