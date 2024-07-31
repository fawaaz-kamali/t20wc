/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.southafrica;
import main.players.Player;

public class HeinrichKlaasen extends Player
{
    public HeinrichKlaasen()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Heinrich Klaasen");
        this.setBattingRating(90);
        this.setBowlingRating(25);
        this.setOverallRating(89);
    }
}
