/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.england;
import main.players.Player;

public class MarkWood extends Player
{
    public MarkWood()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Mark Wood");
        this.setBattingRating(30);
        this.setBowlingRating(88);
        this.setOverallRating(86);
    }
}
