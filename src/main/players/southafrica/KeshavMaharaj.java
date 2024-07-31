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

public class KeshavMaharaj extends Player
{
    public KeshavMaharaj()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Keshav Maharaj");
        this.setBattingRating(45);
        this.setBowlingRating(83);
        this.setOverallRating(83);
    }
}
