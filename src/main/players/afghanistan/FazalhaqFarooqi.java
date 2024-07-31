/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.afghanistan;
import main.players.Player;

public class FazalhaqFarooqi extends Player
{
    public FazalhaqFarooqi()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Fazalhaq Farooqi");
        this.setBattingRating(72);
        this.setBowlingRating(78);
        this.setOverallRating(76);
    }
}
