/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.newzealand;
import main.players.Player;

public class KaneWilliamson extends Player
{
    public KaneWilliamson()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Kane Williamson");
        this.setBattingRating(88);
        this.setBowlingRating(30);
        this.setOverallRating(90);
    }
}

