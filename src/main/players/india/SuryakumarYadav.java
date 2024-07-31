/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.india;
import main.players.Player;

public class SuryakumarYadav extends Player
{
    public SuryakumarYadav()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Suryakumar Yadav");
        this.setBattingRating(88);
        this.setBowlingRating(38);
        this.setOverallRating(88);
    }
}
