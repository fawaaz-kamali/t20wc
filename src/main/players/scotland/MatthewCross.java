/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.scotland;
import main.players.Player;

public class MatthewCross extends Player
{
    public MatthewCross()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Matthew Cross");
        this.setBattingRating(70);
        this.setBowlingRating(32);
        this.setOverallRating(72);
    }
}
