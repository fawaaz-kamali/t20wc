/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      31 July 2024
 * @description     Player class
 * 
 * 
 * 
**********************************/
package main.players.newzealand;

import main.players.Player;

public class MitchellSantner extends Player {
    public MitchellSantner() {
        super();
        setRatings();
    }

    public void setRatings() {
        this.setName("Mitchell Santner");
        this.setBattingRating(72);
        this.setBowlingRating(88);
        this.setOverallRating(88);
    }
}
