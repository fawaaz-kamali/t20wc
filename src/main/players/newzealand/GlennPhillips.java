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

public class GlennPhillips extends Player
{
    public GlennPhillips()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Glenn Phillips");
        this.setBattingRating(85);
        this.setBowlingRating(80);
        this.setOverallRating(85);
    }
}

