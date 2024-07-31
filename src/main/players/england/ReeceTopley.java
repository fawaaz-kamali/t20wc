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

public class ReeceTopley extends Player
{
    public ReeceTopley()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Reece Topley");
        this.setBattingRating(30);
        this.setBowlingRating(82);
        this.setOverallRating(82);
    }
}
