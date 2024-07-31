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

public class NavneetDhaliwal extends Player
{
    public NavneetDhaliwal()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Navneet Dhaliwal");
        this.setBattingRating(74);
        this.setBowlingRating(40);
        this.setOverallRating(73);
    }
}
