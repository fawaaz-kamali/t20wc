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

public class PaulVanMeekeren extends Player
{
    public PaulVanMeekeren()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Paul van Meekeren");
        this.setBattingRating(30);
        this.setBowlingRating(80);
        this.setOverallRating(82);
    }
}
