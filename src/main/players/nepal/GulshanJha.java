/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.nepal;
import main.players.Player;

public class GulshanJha extends Player
{
    public GulshanJha()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Gulshan Jha");
        this.setBattingRating(68);
        this.setBowlingRating(75);
        this.setOverallRating(72);
    }
}
