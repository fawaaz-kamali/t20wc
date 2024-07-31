/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
 **********************************/
package main.players.usa;
import main.players.Player;

public class MonankPatel extends Player
{
    public MonankPatel()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Monank Patel");
        this.setBattingRating(78);
        this.setBowlingRating(30);
        this.setOverallRating(78);
    }
}

