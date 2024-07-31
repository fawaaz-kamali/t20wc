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

public class MoeenAli extends Player
{
    public MoeenAli()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Moeen Ali");
        this.setBattingRating(82);
        this.setBowlingRating(80);
        this.setOverallRating(82);
    }
}
