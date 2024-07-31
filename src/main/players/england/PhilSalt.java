/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.england;
import main.players.Player;

public class PhilSalt extends Player
{
    public PhilSalt()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Phil Salt");
        this.setBattingRating(85);
        this.setBowlingRating(30);
        this.setOverallRating(86);
    }
}
