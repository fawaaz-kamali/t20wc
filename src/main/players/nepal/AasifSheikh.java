/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.nepal;
import main.players.Player;

public class AasifSheikh extends Player
{
    public AasifSheikh()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Aasif Sheikh");
        this.setBattingRating(78);
        this.setBowlingRating(25);
        this.setOverallRating(79);
    }
}
