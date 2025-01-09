/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.australia;
import main.players.Player;

public class TravisHead extends Player
{
    public TravisHead()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Travis Head");
        this.setBattingRating(93);
        this.setBowlingRating(80);
        this.setOverallRating(84);
    }
}
