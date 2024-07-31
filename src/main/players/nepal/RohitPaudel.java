/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.nepal;
import main.players.Player;

public class RohitPaudel extends Player
{
    public RohitPaudel()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Rohit Paudel");
        this.setBattingRating(78);
        this.setBowlingRating(35);
        this.setOverallRating(79);
    }
}
