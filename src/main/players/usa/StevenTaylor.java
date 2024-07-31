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

public class StevenTaylor extends Player
{
    public StevenTaylor()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Steven Taylor");
        this.setBattingRating(80);
        this.setBowlingRating(30);
        this.setOverallRating(81);
    }
}
