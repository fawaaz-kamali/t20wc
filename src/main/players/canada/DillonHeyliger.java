/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.canada;
import main.players.Player;

public class DillonHeyliger extends Player
{
    public DillonHeyliger()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Dillon Heyliger");
        this.setBattingRating(70);
        this.setBowlingRating(78);
        this.setOverallRating(80);
    }
}
