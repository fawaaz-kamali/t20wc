/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.netherlands;
import main.players.Player;

public class ScottEdwards extends Player
{
    public ScottEdwards()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Scott Edwards");
        this.setBattingRating(80);
        this.setBowlingRating(30);
        this.setOverallRating(82);
    }
}
