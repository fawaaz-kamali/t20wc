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

public class AzmatullahOmarzai extends Player
{
    public AzmatullahOmarzai()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Azmatullah Omarzai");
        this.setBattingRating(75);
        this.setBowlingRating(30);
        this.setOverallRating(75);
    }
}
