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

public class HarryTector extends Player
{
    public HarryTector()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Harry Tector");
        this.setBattingRating(78);
        this.setBowlingRating(28);
        this.setOverallRating(79);
    }
}
