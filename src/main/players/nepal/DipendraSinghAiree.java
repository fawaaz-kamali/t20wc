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

public class DipendraSinghAiree extends Player
{
    public DipendraSinghAiree()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Dipendra Singh Airee");
        this.setBattingRating(74);
        this.setBowlingRating(75);
        this.setOverallRating(78);
    }
}
