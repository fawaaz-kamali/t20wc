/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.usa;
import main.players.Player;

public class JessySingh extends Player
{
    public JessySingh()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Jessy Singh");
        this.setBattingRating(29);
        this.setBowlingRating(75);
        this.setOverallRating(74);
    }
}
