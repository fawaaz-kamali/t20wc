/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.afghanistan;
import main.players.Player;

public class GulbadinNaib extends Player
{
    public GulbadinNaib()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Gulbadin Naib");
        this.setBattingRating(75);
        this.setBowlingRating(50);
        this.setOverallRating(75);
    }
}
