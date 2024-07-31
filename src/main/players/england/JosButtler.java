/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.england;
import main.players.Player;

public class JosButtler extends Player
{
    public JosButtler()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Jos Buttler");
        this.setBattingRating(88);
        this.setBowlingRating(30);
        this.setOverallRating(90);
    }
}
