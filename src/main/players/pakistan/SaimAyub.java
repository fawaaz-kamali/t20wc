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

public class SaimAyub extends Player
{
    public SaimAyub()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Saim Ayub");
        this.setBattingRating(78);
        this.setBowlingRating(30);
        this.setOverallRating(78);
    }
}
