/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.ireland;
import main.players.Player;

public class GeorgeDockrell extends Player
{
    public GeorgeDockrell()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("George Dockrell");
        this.setBattingRating(73);
        this.setBowlingRating(80);
        this.setOverallRating(78);
    }
}
