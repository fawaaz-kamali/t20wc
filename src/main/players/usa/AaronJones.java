/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.usa;
import main.players.Player;

public class AaronJones extends Player
{
    public AaronJones()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Aaron Jones");
        this.setBattingRating(82);
        this.setBowlingRating(29);
        this.setOverallRating(82);
    }
}
