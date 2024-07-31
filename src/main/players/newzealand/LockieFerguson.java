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

public class LockieFerguson extends Player
{
    public LockieFerguson()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Lockie Ferguson");
        this.setBattingRating(30);
        this.setBowlingRating(88);
        this.setOverallRating(90);
    }
}

