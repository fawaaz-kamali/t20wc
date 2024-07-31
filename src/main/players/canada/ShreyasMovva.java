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

public class ShreyasMovva extends Player
{
    public ShreyasMovva()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Shreyas Movva");
        this.setBattingRating(75);
        this.setBowlingRating(32);
        this.setOverallRating(75);
    }
}
