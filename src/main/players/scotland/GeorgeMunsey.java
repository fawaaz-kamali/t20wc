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

public class GeorgeMunsey extends Player
{
    public GeorgeMunsey()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("George Munsey");
        this.setBattingRating(82);
        this.setBowlingRating(30);
        this.setOverallRating(82);
    }
}
