/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.newzealand;
import main.players.Player;

public class MichaelBracewell extends Player
{
    public MichaelBracewell()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Michael Bracewell");
        this.setBattingRating(70);
        this.setBowlingRating(78);
        this.setOverallRating(79);
    }
}

