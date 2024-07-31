/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.netherlands;
import main.players.Player;

public class MichaelLevitt extends Player
{
    public MichaelLevitt()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Michael Levitt");
        this.setBattingRating(81);
        this.setBowlingRating(40);
        this.setOverallRating(79);
    }
}
