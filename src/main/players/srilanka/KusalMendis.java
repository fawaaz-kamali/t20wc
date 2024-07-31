/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.srilanka;
import main.players.Player;

public class KusalMendis extends Player
{
    public KusalMendis()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Kusal Mendis");
        this.setBattingRating(82);
        this.setBowlingRating(30);
        this.setOverallRating(82);
    }
}
