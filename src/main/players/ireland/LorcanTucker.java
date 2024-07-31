/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.ireland;
import main.players.Player;

public class LorcanTucker extends Player
{
    public LorcanTucker()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Lorcan Tucker");
        this.setBattingRating(72);
        this.setBowlingRating(30);
        this.setOverallRating(72);
    }
}
