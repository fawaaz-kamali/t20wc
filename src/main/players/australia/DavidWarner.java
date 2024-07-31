/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.australia;
import main.players.Player;

public class DavidWarner extends Player
{
    public DavidWarner()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("David Warner");
        this.setBattingRating(88);
        this.setBowlingRating(55);
        this.setOverallRating(86);
    }
}
