/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.canada;
import main.players.Player;

public class JeremyGordon extends Player
{
    public JeremyGordon()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Jeremy Gordon");
        this.setBattingRating(23);
        this.setBowlingRating(78);
        this.setOverallRating(78);
    }
}
