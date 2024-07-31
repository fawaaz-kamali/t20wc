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

public class RohitSharma extends Player
{
    public RohitSharma()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Rohit Sharma");
        this.setBattingRating(90);
        this.setBowlingRating(35);
        this.setOverallRating(90);
    }
}

