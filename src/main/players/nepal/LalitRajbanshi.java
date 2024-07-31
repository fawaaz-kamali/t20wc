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

public class LalitRajbanshi extends Player
{
    public LalitRajbanshi()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Lalit Rajbanshi");
        this.setBattingRating(55);
        this.setBowlingRating(78);
        this.setOverallRating(76);
    }
}
