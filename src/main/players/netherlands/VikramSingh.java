/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.netherlands;
import main.players.Player;

public class VikramSingh extends Player
{
    public VikramSingh()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Vikram Singh");
        this.setBattingRating(75);
        this.setBowlingRating(40);
        this.setOverallRating(76);
    }
}
