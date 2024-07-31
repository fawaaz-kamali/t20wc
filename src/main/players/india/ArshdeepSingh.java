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

public class ArshdeepSingh extends Player
{
    public ArshdeepSingh()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Arshdeep Singh");
        this.setBattingRating(52);
        this.setBowlingRating(85);
        this.setOverallRating(85);
    }
}
