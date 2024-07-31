/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.newzealand;
import main.players.Player;

public class TimSouthee extends Player
{
    public TimSouthee()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Tim Southee");
        this.setBattingRating(30);
        this.setBowlingRating(85);
        this.setOverallRating(88);
    }
}

