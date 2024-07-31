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

public class QuintonDeKock extends Player
{
    public QuintonDeKock()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Quinton de Kock");
        this.setBattingRating(88);
        this.setBowlingRating(25);
        this.setOverallRating(90);
    }
}
