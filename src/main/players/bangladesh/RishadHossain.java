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

public class RishadHossain extends Player
{
    public RishadHossain()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Rishad Hossain");
        this.setBattingRating(48);
        this.setBowlingRating(75);
        this.setOverallRating(74);
    }
}
