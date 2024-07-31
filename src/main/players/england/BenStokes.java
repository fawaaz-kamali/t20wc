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

public class BenStokes extends Player
{
    public BenStokes()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Ben Stokes");
        this.setBattingRating(86);
        this.setBowlingRating(82);
        this.setOverallRating(88);
    }
}
