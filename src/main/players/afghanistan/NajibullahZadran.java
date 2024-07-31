/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.afghanistan;
import main.players.Player;

public class NajibullahZadran extends Player
{
    public NajibullahZadran()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Najibullah Zadran");
        this.setBattingRating(80);
        this.setBowlingRating(30);
        this.setOverallRating(80);
    }
}
