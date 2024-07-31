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

public class YashasviJaiswal extends Player
{
    public YashasviJaiswal()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Yashasvi Jaiswal");
        this.setBattingRating(85);
        this.setBowlingRating(30);
        this.setOverallRating(84);
    }
}
