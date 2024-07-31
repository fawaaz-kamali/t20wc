/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.india;
import main.players.Player;

public class HardikPandya extends Player
{
    public HardikPandya()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Hardik Pandya");
        this.setBattingRating(86);
        this.setBowlingRating(84);
        this.setOverallRating(85);
    }
}
