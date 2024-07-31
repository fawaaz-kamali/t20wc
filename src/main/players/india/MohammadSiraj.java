/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      30 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.india;
import main.players.Player;

public class MohammadSiraj extends Player
{
    public MohammadSiraj()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Mohammad Siraj");
        this.setBattingRating(48);
        this.setBowlingRating(87);
        this.setOverallRating(87);
    }
}
