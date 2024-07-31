/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import main.players.canada.*;


public class Canada extends Team
{
    public Canada()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("Canada");
        // instantiating players
        player1 = new SaadBinZafar();       
        player2 = new AaronJohnson();      
        player3 = new ShreyasMovva();
        player4 = new DillonHeyliger();
        player5 = new KaleemSana();
        player6 = new PargatSingh();
        player7 = new NicholasKirton();
        player8 = new NavneetDhaliwal();
        player9 = new NikhilDutta();
        player10 = new JeremyGordon();
        player11 = new JunaidSiddiqui();
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