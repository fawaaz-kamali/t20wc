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

public class KushalMalla extends Player
{
    public KushalMalla()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Kushal Malla");
        this.setBattingRating(70);
        this.setBowlingRating(72);
        this.setOverallRating(74);
    }
}
