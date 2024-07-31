/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.westindies;
import main.players.Player;

public class ObedMcCoy extends Player
{
    public ObedMcCoy()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Obed McCoy");
        this.setBattingRating(30);
        this.setBowlingRating(82);
        this.setOverallRating(80);
    }
}
