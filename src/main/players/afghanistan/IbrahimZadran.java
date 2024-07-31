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

public class IbrahimZadran extends Player
{
    public IbrahimZadran()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Ibrahim Zadran");
        this.setBattingRating(78);
        this.setBowlingRating(40);
        this.setOverallRating(78);
    }
}
