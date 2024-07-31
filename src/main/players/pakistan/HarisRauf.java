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

public class HarisRauf extends Player
{
    public HarisRauf()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Haris Rauf");
        this.setBattingRating(40);
        this.setBowlingRating(82);
        this.setOverallRating(84);
    }
}
