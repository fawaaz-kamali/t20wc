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

public class ShakibAlHasan extends Player
{
    public ShakibAlHasan()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Shakib Al Hasan");
        this.setBattingRating(86);
        this.setBowlingRating(90);
        this.setOverallRating(90);
    }
}
