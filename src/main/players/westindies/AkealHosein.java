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

public class AkealHosein extends Player
{
    public AkealHosein()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Akeal Hosein");
        this.setBattingRating(32);
        this.setBowlingRating(82);
        this.setOverallRating(78);
    }
}
