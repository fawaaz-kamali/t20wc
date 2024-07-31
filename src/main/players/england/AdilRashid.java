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

public class AdilRashid extends Player
{
    public AdilRashid()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Adil Rashid");
        this.setBattingRating(40);
        this.setBowlingRating(82);
        this.setOverallRating(82);
    }
}
