/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.bangladesh;
import main.players.Player;

public class TanzimHasanSakib extends Player
{
    public TanzimHasanSakib()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Tanzim Hasan Sakib");
        this.setBattingRating(38);
        this.setBowlingRating(75);
        this.setOverallRating(74);
    }
}
