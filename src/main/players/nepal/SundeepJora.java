/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.nepal;
import main.players.Player;

public class SundeepJora extends Player
{
    public SundeepJora()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Sundeep Jora");
        this.setBattingRating(32);
        this.setBowlingRating(70);
        this.setOverallRating(70);
    }
}
