/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.afghanistan;
import main.players.Player;

public class RahmanullahGurbaz extends Player
{
    public RahmanullahGurbaz()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Rahmanullah Gurbaz");
        this.setBattingRating(82);
        this.setBowlingRating(40);
        this.setOverallRating(82);
    }
}
