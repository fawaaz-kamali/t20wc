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

public class MohammadAmir extends Player
{
    public MohammadAmir()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Mohammad Amir");
        this.setBattingRating(30);
        this.setBowlingRating(85);
        this.setOverallRating(85);
    }
}
