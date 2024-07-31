/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.pakistan;
import main.players.Player;

public class BabarAzam extends Player
{
    public BabarAzam()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Babar Azam");
        this.setBattingRating(90);
        this.setBowlingRating(55);
        this.setOverallRating(90);
    }
}
