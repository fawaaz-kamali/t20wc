/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.nepal;
import main.players.Player;

public class AbinashBohara extends Player
{
    public AbinashBohara()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Abinash Bohara");
        this.setBattingRating(30);
        this.setBowlingRating(75);
        this.setOverallRating(74);
    }
}
