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

public class AlzarriJoseph extends Player
{
    public AlzarriJoseph()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Alzarri Joseph");
        this.setBattingRating(50);
        this.setBowlingRating(85);
        this.setOverallRating(80);
    }
}
