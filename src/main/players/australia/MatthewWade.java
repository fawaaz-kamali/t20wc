/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.australia;
import main.players.Player;

public class MatthewWade extends Player
{
    public MatthewWade()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Matthew Wade");
        this.setBattingRating(82);
        this.setBowlingRating(30);
        this.setOverallRating(81);
    }
}
