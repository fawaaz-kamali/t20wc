/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.netherlands;
import main.players.Player;

public class TimPringle extends Player
{
    public TimPringle()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Tim Pringle");
        this.setBattingRating(30);
        this.setBowlingRating(75);
        this.setOverallRating(74);
    }
}
