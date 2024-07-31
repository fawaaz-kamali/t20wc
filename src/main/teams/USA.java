/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import main.players.usa.*;


public class USA extends Team
{
    public USA()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("USA");
        // instantiating players
        player1 = new MonankPatel();       
        player2 = new AaronJones();      
        player3 = new StevenTaylor();
        player4 = new CoreyAnderson();
        player5 = new SaurabhNetravalkar();
        player6 = new JessySingh();
        player7 = new HarmeetSingh();
        player8 = new NoshtushKenjige();
        player9 = new ShadleyVanSchalkwyk();
        player10 = new NitishKumar();
        player11 = new AliKhan();
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