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

public class KushalBhurtel extends Player
{
    public KushalBhurtel()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Kushal Bhurtel");
        this.setBattingRating(75);
        this.setBowlingRating(32);
        this.setOverallRating(75);
    }
}
