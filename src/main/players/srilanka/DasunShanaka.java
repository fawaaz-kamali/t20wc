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

public class DasunShanaka extends Player
{
    public DasunShanaka()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Dasun Shanaka");
        this.setBattingRating(78);
        this.setBowlingRating(60);
        this.setOverallRating(78);
    }
}
