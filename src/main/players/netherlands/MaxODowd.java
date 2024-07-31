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

public class MaxODowd extends Player
{
    public MaxODowd()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Max O'Dowd");
        this.setBattingRating(78);
        this.setBowlingRating(30);
        this.setOverallRating(78);
    }
}
