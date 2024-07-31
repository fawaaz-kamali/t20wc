/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.australia;
import main.players.Player;

public class PatCummins extends Player
{
    public PatCummins()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Pat Cummins");
        this.setBattingRating(78);
        this.setBowlingRating(90);
        this.setOverallRating(92);
    }
}
