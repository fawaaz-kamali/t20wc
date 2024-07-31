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

public class JofraArcher extends Player
{
    public JofraArcher()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Jofra Archer");
        this.setBattingRating(30);
        this.setBowlingRating(90);
        this.setOverallRating(90);
    }
}
