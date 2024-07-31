/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.nepal;
import main.players.Player;

public class AnilKumarSah extends Player
{
    public AnilKumarSah()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Anil Kumar Sah");
        this.setBattingRating(72);
        this.setBowlingRating(34);
        this.setOverallRating(71);
    }
}
