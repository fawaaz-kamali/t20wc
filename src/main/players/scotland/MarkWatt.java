/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.scotland;
import main.players.Player;

public class MarkWatt extends Player
{
    public MarkWatt()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Mark Watt");
        this.setBattingRating(41);
        this.setBowlingRating(82);
        this.setOverallRating(80);
    }
}
