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

public class HarmeetSingh extends Player
{
    public HarmeetSingh()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Harmeet Singh");
        this.setBattingRating(45);
        this.setBowlingRating(79);
        this.setOverallRating(79);
    }
}
