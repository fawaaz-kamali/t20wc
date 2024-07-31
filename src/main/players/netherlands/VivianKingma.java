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

public class VivianKingma extends Player
{
    public VivianKingma()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Vivian Kingma");
        this.setBattingRating(28);
        this.setBowlingRating(78);
        this.setOverallRating(75);
    }
}
