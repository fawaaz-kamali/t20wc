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

public class SompalKami extends Player
{
    public SompalKami()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Sompal Kami");
        this.setBattingRating(70);
        this.setBowlingRating(80);
        this.setOverallRating(80);
    }
}
