/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      30 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.india;
import main.players.Player;

public class ViratKohli extends Player
{
    public ViratKohli()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Virat Kohli");
        this.setBattingRating(93);
        this.setBowlingRating(68);
        this.setOverallRating(90);
    }
}
