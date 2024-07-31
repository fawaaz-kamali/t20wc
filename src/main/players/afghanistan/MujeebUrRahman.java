/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.afghanistan;
import main.players.Player;

public class MujeebUrRahman extends Player
{
    public MujeebUrRahman()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Mujeeb Ur Rahman");
        this.setBattingRating(60);
        this.setBowlingRating(85);
        this.setOverallRating(88);
    }
}
