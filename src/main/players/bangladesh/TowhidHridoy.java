/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.bangladesh;
import main.players.Player;

public class TowhidHridoy extends Player
{
    public TowhidHridoy()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Towhid Hridoy");
        this.setBattingRating(81);
        this.setBowlingRating(33);
        this.setOverallRating(80);
    }
}
