/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.bangladesh;
import main.players.Player;

public class TaskinAhmed extends Player
{
    public TaskinAhmed()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Taskin Ahmed");
        this.setBattingRating(30);
        this.setBowlingRating(82);
        this.setOverallRating(80);
    }
}
