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

public class JaspritBumrah extends Player
{
    public JaspritBumrah()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Jasprit Bumrah");
        this.setBattingRating(50);
        this.setBowlingRating(92);
        this.setOverallRating(92);
    }
}
