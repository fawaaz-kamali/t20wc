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

public class AdamZampa extends Player
{
    public AdamZampa()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Adam Zampa");
        this.setBattingRating(40);
        this.setBowlingRating(87);
        this.setOverallRating(87);
    }
}
