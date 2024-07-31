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

public class FakharZaman extends Player
{
    public FakharZaman()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Fakhar Zaman");
        this.setBattingRating(85);
        this.setBowlingRating(40);
        this.setOverallRating(85);
    }
}
