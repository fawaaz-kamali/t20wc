/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.australia;
import main.players.Player;

public class MitchellStarc extends Player
{
    public MitchellStarc()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Mitchell Starc");
        this.setBattingRating(70);
        this.setBowlingRating(88);
        this.setOverallRating(90);
    }
}
