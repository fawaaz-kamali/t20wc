/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.scotland;
import main.players.Player;

public class MichaelJones extends Player
{
    public MichaelJones()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Michael Jones");
        this.setBattingRating(75);
        this.setBowlingRating(29);
        this.setOverallRating(75);
    }
}
