/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.westindies;
import main.players.Player;

public class RovmanPowell extends Player
{
    public RovmanPowell()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Rovman Powell");
        this.setBattingRating(82);
        this.setBowlingRating(45);
        this.setOverallRating(84);
    }
}
