/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.southafrica;
import main.players.Player;

public class AnrichNortje extends Player
{
    public AnrichNortje()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Anrich Nortje");
        this.setBattingRating(30);
        this.setBowlingRating(86);
        this.setOverallRating(84);
    }
}
