/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.pakistan;
import main.players.Player;

public class ImadWasim extends Player
{
    public ImadWasim()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Imad Wasim");
        this.setBattingRating(78);
        this.setBowlingRating(80);
        this.setOverallRating(80);
    }
}
