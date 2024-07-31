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

public class GlennMaxwell extends Player
{
    public GlennMaxwell()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Glenn Maxwell");
        this.setBattingRating(80);
        this.setBowlingRating(82);
        this.setOverallRating(82);
    }
}
