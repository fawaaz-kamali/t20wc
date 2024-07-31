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

public class BrandonMcMullen extends Player
{
    public BrandonMcMullen()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Brandon McMullen");
        this.setBattingRating(29);
        this.setBowlingRating(77);
        this.setOverallRating(75);
    }
}
