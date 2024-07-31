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

public class MarcusStoinis extends Player
{
    public MarcusStoinis()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Marcus Stoinis");
        this.setBattingRating(86);
        this.setBowlingRating(86);
        this.setOverallRating(87);
    }
}
