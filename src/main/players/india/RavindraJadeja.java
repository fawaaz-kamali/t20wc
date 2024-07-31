/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.india;
import main.players.Player;

public class RavindraJadeja extends Player
{
    public RavindraJadeja()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Ravindra Jadeja");
        this.setBattingRating(81);
        this.setBowlingRating(85);
        this.setOverallRating(83);
    }
}
