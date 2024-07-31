/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.india;
import main.players.Player;

public class KuldeepYadav extends Player
{
    public KuldeepYadav()
    {
        super();
        setRatings();
    }

    public void setRatings()
    {
        this.setName("Kuldeep Yadav");
        this.setBattingRating(55);
        this.setBowlingRating(82);
        this.setOverallRating(80);
    }
}
