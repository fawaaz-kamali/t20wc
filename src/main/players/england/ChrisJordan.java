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

public class ChrisJordan extends Player
{
    public ChrisJordan()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Chris Jordan");
        this.setBattingRating(40);
        this.setBowlingRating(85);
        this.setOverallRating(84);
    }
}
