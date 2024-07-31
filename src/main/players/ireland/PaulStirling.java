/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.ireland;
import main.players.Player;

public class PaulStirling extends Player
{
    public PaulStirling()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Paul Stirling");
        this.setBattingRating(84);
        this.setBowlingRating(31);
        this.setOverallRating(84);
    }
}
