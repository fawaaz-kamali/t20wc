/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.canada;
import main.players.Player;

public class JunaidSiddiqui extends Player
{
    public JunaidSiddiqui()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Junaid Siddiqui");
        this.setBattingRating(30);
        this.setBowlingRating(75);
        this.setOverallRating(72);
    }
}
