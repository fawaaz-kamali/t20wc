/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.usa;
import main.players.Player;

public class AliKhan extends Player
{
    public AliKhan()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Ali Khan");
        this.setBattingRating(29);
        this.setBowlingRating(82);
        this.setOverallRating(82);
    }
}
