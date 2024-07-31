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

public class SaurabhNetravalkar extends Player
{
    public SaurabhNetravalkar()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Saurabh Netravalkar");
        this.setBattingRating(30);
        this.setBowlingRating(80);
        this.setOverallRating(80);
    }
}
