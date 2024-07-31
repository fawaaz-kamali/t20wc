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

public class TristanStubbs extends Player
{
    public TristanStubbs()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Tristan Stubbs");
        this.setBattingRating(85);
        this.setBowlingRating(30);
        this.setOverallRating(84);
    }
}
