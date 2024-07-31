/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.westindies;
import main.players.Player;

public class NicholasPooran extends Player
{
    public NicholasPooran()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Nicholas Pooran");
        this.setBattingRating(85);
        this.setBowlingRating(30);
        this.setOverallRating(85);
    }
}
