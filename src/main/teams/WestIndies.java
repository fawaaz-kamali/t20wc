/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import main.players.westindies.*;


public class WestIndies extends Team
{
    public WestIndies()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("West Indies");
        // instantiating players
        player1 = new RovmanPowell();       
        player2 = new ShaiHope();      
        player3 = new RostonChase();
        player4 = new JohnsonCharles();
        player5 = new NicholasPooran();
        player6 = new ShimronHetmyer();
        player7 = new JasonHolder();
        player8 = new AndreRussell();
        player9 = new AlzarriJoseph();
        player10 = new AkealHosein();
        player11 = new ObedMcCoy();
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