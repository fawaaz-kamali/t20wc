/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Team class
**********************************/
package main.teams;
import main.players.pakistan.*;


public class Pakistan extends Team
{
    public Pakistan()
    {
        super();
        setTeam();
    }

    public void setTeam()
    {
        this.setName("Pakistan");
        // instantiating players
        player1 = new BabarAzam();       
        player2 = new MohammadRizwan();      
        player3 = new FakharZaman();
        player4 = new SaimAyub();
        player5 = new IftikharAhmed();
        player6 = new ShadabKhan();
        player7 = new ImadWasim();
        player8 = new ShaheenAfridi();
        player9 = new NaseemShah();
        player10 = new HarisRauf();
        player11 = new MohammadAmir();
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