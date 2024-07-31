/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import main.players.netherlands.*;


public class Netherlands extends Team
{
    public Netherlands()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("Netherlands");
        // instantiating players
        player1 = new ScottEdwards();       
        player2 = new LoganVanBeek();      
        player3 = new AryanDutt();
        player4 = new SybrandEngelbrecht();
        player5 = new BasDeLeede();
        player6 = new MichaelLevitt();
        player7 = new PaulVanMeekeren();
        player8 = new MaxODowd();
        player9 = new TimPringle();
        player10 = new VikramSingh();
        player11 = new VivianKingma();
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