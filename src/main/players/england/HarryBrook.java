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

public class HarryBrook extends Player
{
    public HarryBrook()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Harry Brook");
        this.setBattingRating(83);
        this.setBowlingRating(30);
        this.setOverallRating(82);
    }
}
