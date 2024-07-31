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

public class ReezaHendricks extends Player
{
    public ReezaHendricks()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Reeza Hendricks");
        this.setBattingRating(80);
        this.setBowlingRating(25);
        this.setOverallRating(82);
    }
}
