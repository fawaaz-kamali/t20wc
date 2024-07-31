/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.westindies;
import main.players.Player;

public class ShimronHetmyer extends Player
{
    public ShimronHetmyer()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Shimron Hetmyer");
        this.setBattingRating(84);
        this.setBowlingRating(30);
        this.setOverallRating(84);
    }
}
