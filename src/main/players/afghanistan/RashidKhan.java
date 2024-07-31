/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.afghanistan;
import main.players.Player;

public class RashidKhan extends Player
{
    public RashidKhan()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Rashid Khan");
        this.setBattingRating(80);
        this.setBowlingRating(90);
        this.setOverallRating(91);
    }
}
