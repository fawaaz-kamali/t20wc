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

public class IftikharAhmed extends Player
{
    public IftikharAhmed()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Iftikhar Ahmed");
        this.setBattingRating(75);
        this.setBowlingRating(80);
        this.setOverallRating(82);
    }
}
