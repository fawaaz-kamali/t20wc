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

public class MohammadNabi extends Player
{
    public MohammadNabi()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Mohammad Nabi");
        this.setBattingRating(82);
        this.setBowlingRating(85);
        this.setOverallRating(86);
    }
}
