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

public class GarethDelany extends Player
{
    public GarethDelany()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Gareth Delany");
        this.setBattingRating(78);
        this.setBowlingRating(75);
        this.setOverallRating(78);
    }
}
