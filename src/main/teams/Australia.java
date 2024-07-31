/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import main.players.australia.*;


public class Australia extends Team
{
    public Australia()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("Australia");
        // instantiating players
        player1 = new DavidWarner();       
        player2 = new MitchellMarsh();      
        player3 = new MarcusStoinis();
        player4 = new GlennMaxwell();
        player5 = new TravisHead();
        player6 = new MatthewWade();
        player7 = new PatCummins();
        player8 = new JoshHazelwood();
        player9 = new MitchellStarc();
        player10 = new AdamZampa();
        player11 = new AshtonAgar();
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