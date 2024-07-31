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

public class DilshanMadushanka extends Player
{
    public DilshanMadushanka()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Dilshan Madushanka");
        this.setBattingRating(80);
        this.setBowlingRating(40);
        this.setOverallRating(80);
    }
}
