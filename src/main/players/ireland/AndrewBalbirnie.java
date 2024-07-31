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

public class AndrewBalbirnie extends Player
{
    public AndrewBalbirnie()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Andrew Balbirnie");
        this.setBattingRating(80);
        this.setBowlingRating(30);
        this.setOverallRating(82);
    }
}
