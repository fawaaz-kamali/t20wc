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

public class KagisoRabada extends Player
{
    public KagisoRabada()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Kagiso Rabada");
        this.setBattingRating(35);
        this.setBowlingRating(88);
        this.setOverallRating(85);
    }
}
