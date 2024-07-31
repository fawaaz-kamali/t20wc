/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.scotland;
import main.players.Player;

public class RichieBerrington extends Player
{
    public RichieBerrington()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Richie Berrington");
        this.setBattingRating(82);
        this.setBowlingRating(30);
        this.setOverallRating(84);
    }
}
