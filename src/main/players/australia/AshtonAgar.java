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

public class AshtonAgar extends Player
{
    public AshtonAgar()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Ashton Agar");
        this.setBattingRating(30);
        this.setBowlingRating(78);
        this.setOverallRating(80);
    }
}
