/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.bangladesh;
import main.players.Player;

public class MahediHasan extends Player
{
    public MahediHasan()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Mahedi Hasan");
        this.setBattingRating(30);
        this.setBowlingRating(75);
        this.setOverallRating(74);
    }
}
