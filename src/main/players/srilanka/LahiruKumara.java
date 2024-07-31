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

public class LahiruKumara extends Player
{
    public LahiruKumara()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Lahiru Kumara");
        this.setBattingRating(30);
        this.setBowlingRating(85);
        this.setOverallRating(84);
    }
}
