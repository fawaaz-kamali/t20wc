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

public class AndreRussell extends Player
{
    public AndreRussell()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Andre Russell");
        this.setBattingRating(85);
        this.setBowlingRating(84);
        this.setOverallRating(86);
    }
}
