/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.canada;
import main.players.Player;

public class NicholasKirton extends Player
{
    public NicholasKirton()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Nicholas Kirton");
        this.setBattingRating(78);
        this.setBowlingRating(68);
        this.setOverallRating(78);
    }
}
