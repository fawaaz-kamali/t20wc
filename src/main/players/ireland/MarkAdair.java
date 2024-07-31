/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.ireland;
import main.players.Player;

public class MarkAdair extends Player
{
    public MarkAdair()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Mark Adair");
        this.setBattingRating(60);
        this.setBowlingRating(80);
        this.setOverallRating(78);
    }
}
