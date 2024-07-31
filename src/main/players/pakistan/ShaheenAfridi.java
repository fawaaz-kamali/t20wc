/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.pakistan;
import main.players.Player;

public class ShaheenAfridi extends Player
{
    public ShaheenAfridi()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Shaheen Shah Afridi");
        this.setBattingRating(65);
        this.setBowlingRating(88);
        this.setOverallRating(90);
    }
}
