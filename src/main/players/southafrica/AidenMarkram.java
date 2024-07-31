/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.southafrica;
import main.players.Player;

public class AidenMarkram extends Player
{
    public AidenMarkram()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Aiden Markram");
        this.setBattingRating(85);
        this.setBowlingRating(80);
        this.setOverallRating(86);
    }
}
