/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.usa;
import main.players.Player;

public class NoshtushKenjige extends Player
{
    public NoshtushKenjige()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Noshtush Kenjige");
        this.setBattingRating(30);
        this.setBowlingRating(78);
        this.setOverallRating(78);
    }
}
