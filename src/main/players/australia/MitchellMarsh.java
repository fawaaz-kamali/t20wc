/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.australia;
import main.players.Player;

public class MitchellMarsh extends Player
{
    public MitchellMarsh()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Mitchell Marsh");
        this.setBattingRating(80);
        this.setBowlingRating(80);
        this.setOverallRating(83);
    }
}
