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

public class JohnsonCharles extends Player
{
    public JohnsonCharles()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Johnson Charles");
        this.setBattingRating(80);
        this.setBowlingRating(34);
        this.setOverallRating(80);
    }
}
