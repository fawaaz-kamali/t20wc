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

public class MohammadRizwan extends Player
{
    public MohammadRizwan()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Mohammad Rizwan");
        this.setBattingRating(90);
        this.setBowlingRating(30);
        this.setOverallRating(88);
    }
}
