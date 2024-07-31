/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.netherlands;
import main.players.Player;

public class BasDeLeede extends Player
{
    public BasDeLeede()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Bas de Leede");
        this.setBattingRating(82);
        this.setBowlingRating(80);
        this.setOverallRating(81);
    }
}
