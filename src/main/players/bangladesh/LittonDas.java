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

public class LittonDas extends Player
{
    public LittonDas()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Litton Das");
        this.setBattingRating(84);
        this.setBowlingRating(29);
        this.setOverallRating(83);
    }
}
