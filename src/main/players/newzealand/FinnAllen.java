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

public class FinnAllen extends Player
{
    public FinnAllen()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Finn Allen");
        this.setBattingRating(84);
        this.setBowlingRating(40);
        this.setOverallRating(83);
    }
}

