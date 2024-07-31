/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.srilanka;
import main.players.Player;

public class CharithAsalanka extends Player
{
    public CharithAsalanka()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Charith Asalanka");
        this.setBattingRating(78);
        this.setBowlingRating(40);
        this.setOverallRating(78);
    }
}
