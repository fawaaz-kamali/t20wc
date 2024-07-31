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

public class AaronJohnson extends Player
{
    public AaronJohnson()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Aaron Johnson");
        this.setBattingRating(75);
        this.setBowlingRating(32);
        this.setOverallRating(76);
    }
}
