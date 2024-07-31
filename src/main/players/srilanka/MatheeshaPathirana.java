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

public class MatheeshaPathirana extends Player
{
    public MatheeshaPathirana()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Matheesha Pathirana");
        this.setBattingRating(60);
        this.setBowlingRating(85);
        this.setOverallRating(84);
    }
}

