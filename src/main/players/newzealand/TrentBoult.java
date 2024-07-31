/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.newzealand;
import main.players.Player;

public class TrentBoult extends Player
{
    public TrentBoult()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Trent Boult");
        this.setBattingRating(40);
        this.setBowlingRating(88);
        this.setOverallRating(89);
    }
}

