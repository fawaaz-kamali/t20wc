/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.england;
import main.players.Player;

public class JonnyBairstow extends Player
{
    public JonnyBairstow()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Jonny Bairstow");
        this.setBattingRating(83);
        this.setBowlingRating(30);
        this.setOverallRating(83);
    }
}
