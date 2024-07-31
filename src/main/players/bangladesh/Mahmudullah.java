/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.bangladesh;
import main.players.Player;

public class Mahmudullah extends Player
{
    public Mahmudullah()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Mahmudullah");
        this.setBattingRating(82);
        this.setBowlingRating(75);
        this.setOverallRating(83);
    }
}
