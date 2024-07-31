/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.westindies;
import main.players.Player;

public class JasonHolder extends Player
{
    public JasonHolder()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Jason Holder");
        this.setBattingRating(78);
        this.setBowlingRating(85);
        this.setOverallRating(86);
    }
}
