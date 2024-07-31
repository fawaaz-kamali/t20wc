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

public class MohammadIshaq extends Player
{
    public MohammadIshaq()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Mohammad Ishaq");
        this.setBattingRating(70);
        this.setBowlingRating(75);
        this.setOverallRating(72);
    }
}
