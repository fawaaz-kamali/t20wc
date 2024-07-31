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

public class SoumyaSarkar extends Player
{
    public SoumyaSarkar()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Soumya Sarkar");
        this.setBattingRating(78);
        this.setBowlingRating(30);
        this.setOverallRating(78);
    }
}
