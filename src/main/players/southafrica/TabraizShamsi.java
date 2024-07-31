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

public class TabraizShamsi extends Player
{
    public TabraizShamsi()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Tabraiz Shamsi");
        this.setBattingRating(25);
        this.setBowlingRating(82);
        this.setOverallRating(80);
    }
}
