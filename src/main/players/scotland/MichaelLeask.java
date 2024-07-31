/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.scotland;
import main.players.Player;

public class MichaelLeask extends Player
{
    public MichaelLeask()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Michael Leask");
        this.setBattingRating(78);
        this.setBowlingRating(52);
        this.setOverallRating(78);
    }
}
