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

public class BarryMcCarthy extends Player
{
    public BarryMcCarthy()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Barry McCarthy");
        this.setBattingRating(35);
        this.setBowlingRating(78);
        this.setOverallRating(76);
    }
}
