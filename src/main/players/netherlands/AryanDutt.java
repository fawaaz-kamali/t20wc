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

public class AryanDutt extends Player
{
    public AryanDutt()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Aryan Dutt");
        this.setBattingRating(32);
        this.setBowlingRating(75);
        this.setOverallRating(74);
    }
}
