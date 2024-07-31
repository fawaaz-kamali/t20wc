/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.ireland;
import main.players.Player;

public class CurtisCampher extends Player
{
    public CurtisCampher()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Curtis Campher");
        this.setBattingRating(75);
        this.setBowlingRating(45);
        this.setOverallRating(78);
    }
}
