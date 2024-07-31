/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.srilanka;
import main.players.Player;

public class MaheeshTheekshana extends Player
{
    public MaheeshTheekshana()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Maheesh Theekshana");
        this.setBattingRating(60);
        this.setBowlingRating(82);
        this.setOverallRating(82);
    }
}
