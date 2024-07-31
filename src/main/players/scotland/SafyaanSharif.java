/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.scotland;
import main.players.Player;

public class SafyaanSharif extends Player
{
    public SafyaanSharif()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Safyaan Sharif");
        this.setBattingRating(30);
        this.setBowlingRating(78);
        this.setOverallRating(78);
    }
}
