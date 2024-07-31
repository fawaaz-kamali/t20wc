/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.canada;
import main.players.Player;

public class PargatSingh extends Player
{
    public PargatSingh()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Pargat Singh");
        this.setBattingRating(72);
        this.setBowlingRating(35);
        this.setOverallRating(73);
    }
}
