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

public class ChrisGreaves extends Player
{
    public ChrisGreaves()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Chris Greaves");
        this.setBattingRating(72);
        this.setBowlingRating(75);
        this.setOverallRating(75);
    }
}
