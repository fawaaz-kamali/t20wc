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

public class CoreyAnderson extends Player
{
    public CoreyAnderson()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Corey Anderson");
        this.setBattingRating(82);
        this.setBowlingRating(75);
        this.setOverallRating(82);
    }
}
