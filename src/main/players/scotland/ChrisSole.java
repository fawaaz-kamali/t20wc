/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.scotland;
import main.players.Player;

public class ChrisSole extends Player
{
    public ChrisSole()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Chris Sole");
        this.setBattingRating(34);
        this.setBowlingRating(78);
        this.setOverallRating(75);
    }
}
