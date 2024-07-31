/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.pakistan;
import main.players.Player;

public class NaseemShah extends Player
{
    public NaseemShah()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Naseem Shah");
        this.setBattingRating(57);
        this.setBowlingRating(85);
        this.setOverallRating(86);
    }
}
