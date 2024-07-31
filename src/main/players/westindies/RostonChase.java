/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.westindies;
import main.players.Player;

public class RostonChase extends Player
{
    public RostonChase()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Roston Chase");
        this.setBattingRating(75);
        this.setBowlingRating(54);
        this.setOverallRating(77);
    }
}
