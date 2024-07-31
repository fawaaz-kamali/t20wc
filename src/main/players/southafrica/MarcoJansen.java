/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.southafrica;
import main.players.Player;

public class MarcoJansen extends Player
{
    public MarcoJansen()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Marco Jansen");
        this.setBattingRating(72);
        this.setBowlingRating(85);
        this.setOverallRating(86);
    }
}
