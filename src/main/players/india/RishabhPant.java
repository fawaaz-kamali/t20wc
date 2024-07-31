/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.india;
import main.players.Player;

public class RishabhPant extends Player
{
    public RishabhPant()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Rishabh Pant");
        this.setBattingRating(85);
        this.setBowlingRating(25);
        this.setOverallRating(85);
    }
}
