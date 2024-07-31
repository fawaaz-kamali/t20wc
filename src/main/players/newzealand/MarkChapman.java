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

public class MarkChapman extends Player
{
    public MarkChapman()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Mark Chapman");
        this.setBattingRating(78);
        this.setBowlingRating(30);
        this.setOverallRating(75);
    }
}

