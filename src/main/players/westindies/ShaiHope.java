/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.westindies;
import main.players.Player;

public class ShaiHope extends Player
{
    public ShaiHope()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Shai Hope");
        this.setBattingRating(78);
        this.setBowlingRating(30);
        this.setOverallRating(78);
    }
}
