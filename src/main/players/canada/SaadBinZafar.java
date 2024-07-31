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

public class SaadBinZafar extends Player
{
    public SaadBinZafar()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Saad Bin Zafar");
        this.setBattingRating(56);
        this.setBowlingRating(75);
        this.setOverallRating(76);
    }
}
