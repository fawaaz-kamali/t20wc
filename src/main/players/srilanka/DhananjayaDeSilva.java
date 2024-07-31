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

public class DhananjayaDeSilva extends Player
{
    public DhananjayaDeSilva()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Dhananjaya de Silva");
        this.setBattingRating(75);
        this.setBowlingRating(50);
        this.setOverallRating(75);
    }
}
