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

public class BenWhite extends Player
{
    public BenWhite()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Ben White");
        this.setBattingRating(27);
        this.setBowlingRating(75);
        this.setOverallRating(72);
    }
}
