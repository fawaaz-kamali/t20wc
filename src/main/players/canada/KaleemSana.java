/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.canada;
import main.players.Player;

public class KaleemSana extends Player
{
    public KaleemSana()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Kaleem Sana");
        this.setBattingRating(30);
        this.setBowlingRating(75);
        this.setOverallRating(74);
    }
}
