/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.srilanka;
import main.players.Player;

public class WaninduHasaranga extends Player
{
    public WaninduHasaranga()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Wanindu Hasaranga");
        this.setBattingRating(85);
        this.setBowlingRating(88);
        this.setOverallRating(90);
    }
}
