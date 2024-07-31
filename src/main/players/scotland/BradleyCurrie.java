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

public class BradleyCurrie extends Player
{
    public BradleyCurrie()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Bradley Currie");
        this.setBattingRating(32);
        this.setBowlingRating(75);
        this.setOverallRating(72);
    }
}
