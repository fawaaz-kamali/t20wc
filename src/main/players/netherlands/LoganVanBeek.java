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

public class LoganVanBeek extends Player
{
    public LoganVanBeek()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Logan van Beek");
        this.setBattingRating(30);
        this.setBowlingRating(78);
        this.setOverallRating(76);
    }
}
