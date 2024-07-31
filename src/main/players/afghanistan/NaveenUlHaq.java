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

public class NaveenUlHaq extends Player
{
    public NaveenUlHaq()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Naveen-ul-Haq");
        this.setBattingRating(40);
        this.setBowlingRating(82);
        this.setOverallRating(80);
    }
}
