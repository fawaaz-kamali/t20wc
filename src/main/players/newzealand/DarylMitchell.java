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

public class DarylMitchell extends Player
{
    public DarylMitchell()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Daryl Mitchell");
        this.setBattingRating(78);
        this.setBowlingRating(50);
        this.setOverallRating(78);
    }
}

