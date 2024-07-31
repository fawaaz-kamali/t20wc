/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.newzealand;
import main.players.Player;

public class DevonConway extends Player
{
    public DevonConway()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Devon Conway");
        this.setBattingRating(85);
        this.setBowlingRating(30);
        this.setOverallRating(84);
    }
}

