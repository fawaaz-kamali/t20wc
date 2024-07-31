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

public class NitishKumar extends Player
{
    public NitishKumar()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Nitish Kumar");
        this.setBattingRating(75);
        this.setBowlingRating(38);
        this.setOverallRating(75);
    }
}
