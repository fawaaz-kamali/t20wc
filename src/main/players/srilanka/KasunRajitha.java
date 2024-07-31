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

public class KasunRajitha extends Player
{
    public KasunRajitha()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Kasun Rajitha");
        this.setBattingRating(40);
        this.setBowlingRating(82);
        this.setOverallRating(82);
    }
}

