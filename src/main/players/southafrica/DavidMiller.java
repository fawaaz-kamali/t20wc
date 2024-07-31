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

public class DavidMiller extends Player
{
    public DavidMiller()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("David Miller");
        this.setBattingRating(88);
        this.setBowlingRating(25);
        this.setOverallRating(87);
    }
}
