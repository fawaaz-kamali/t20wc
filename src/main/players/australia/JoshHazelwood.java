/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.australia;
import main.players.Player;

public class JoshHazelwood extends Player
{
    public JoshHazelwood()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Josh Hazelwood");
        this.setBattingRating(40);
        this.setBowlingRating(87);
        this.setOverallRating(86);
    }
}
