/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.netherlands;
import main.players.Player;

public class SybrandEngelbrecht extends Player
{
    public SybrandEngelbrecht()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Sybrand Engelbrecht");
        this.setBattingRating(74);
        this.setBowlingRating(40);
        this.setOverallRating(73);
    }
}
