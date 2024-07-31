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

public class JoshLittle extends Player
{
    public JoshLittle()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Josh Little");
        this.setBattingRating(70);
        this.setBowlingRating(82);
        this.setOverallRating(82);
    }
}
