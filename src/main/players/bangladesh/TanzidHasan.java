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

public class TanzidHasan extends Player
{
    public TanzidHasan()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Tanzid Hasan");
        this.setBattingRating(80);
        this.setBowlingRating(30);
        this.setOverallRating(80);
    }
}
