/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.usa;
import main.players.Player;

public class ShadleyVanSchalkwyk extends Player
{
    public ShadleyVanSchalkwyk()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Shadley van Schalkwyk");
        this.setBattingRating(32);
        this.setBowlingRating(75);
        this.setOverallRating(75);
    }
}
