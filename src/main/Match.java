/**********************************
 * @author          Fawaaz Kamali Siddiqui
 * @lastupdate      17 July 2024
 * @description     
 * 
 * 
 * 
**********************************/
package main;
import main.players.Player;
import main.teams.Team;
import main.Utilities;


public class Match
{

    // MATCH VARIABLES
    private int currentRuns;
    private int currentWickets;
    private Player currentBowler;
    private Player currentStriker;
    private Player currentNonStriker;
    private int target;
    

    /****************
     * preGameCommentary(): before a match starts, there will always 
     * be a commentary to build anticipation and thrill
     */
    public static void preGameCommentary(Team userTeam, Team opponent)
    {
        String[] lines = {
            String.format("It's the match everybody is talking about. %s takes on %s in what could turn out to be a turning point in this year's T10 World Cup.", opponent.getName(), userTeam.getName()), 
            String.format("And here we go. Tonight's match between %s and %s is one that looks quite promising. The thrill in the stadium is intense as both sets of fans roar their chants.", userTeam.getName(), opponent.getName()),
            String.format("Well there has been quite controversy surrounding this match. After brief physical altercations between both captains, %s and %s will finally meet each other on the pitch.", opponent.getName(), userTeam.getName()),
            String.format("Only a few sporting rivalries come close to this one. Both %s and %s are willing to give it all in this elimination match.", userTeam.getName(), opponent.getName()),
            String.format("Well, what can we say. It's the match everybody is talking about. Cricket fans around the globe have been anticipating the fixture between %s and %s, and here it is.", userTeam.getName(), opponent.getName()),
            String.format("Quite a lot of anticipation surrounding tonight's match as 2 great cricketing nations, %s and %s, take on each other in a vital fixture in this year's World Cup.", userTeam.getName(), opponent.getName())
        };
        int randomLine = (int)(Math.random()*lines.length);
        Utilities.slowPrint(lines[randomLine], 40);
    }

    /****************
     * wicketCommentary(): when a wicket is taken, there will 
     * be a slow printed commentary to make the game realistic
     */
    public static void wicketCommentary(Player bowler, Player batsman)
    {
        String bowlerName = bowler.getName();
        String batsmanName = batsman.getName();
        String[] lines = {
            String.format("He's got him! %s breaks through the defenses of %s and a vital wicket has fallen!", bowlerName, batsmanName),
            String.format("Oh what a beauty! %s stares in astonishment as %s has produced an absolute jaffer!", batsmanName, bowlerName),
            String.format("Right in the blockhole! %s bowls a perfect yorker and there is nothing %s could have done about it. Wonderful delivery.", bowlerName, batsmanName),
            String.format("The bails go off! Wonderful line and length from %s as he takes the crucial wicket of %s.", bowlerName, batsmanName),
            String.format("What an outstanding catch by the wicket-keeper! %s will be delighted to get the wicket. Surely one of the best catches of the tournament as the keeper dives and stretches to his right.", bowlerName),
            String.format("Oh no! That is a terrible shot selection from %s. %s is laughing histerically as he can't believe what he's just seen!", batsmanName, bowlerName),
            String.format("Stumped! A piece of tactical brilliance as the wicket-keeper steps forward. The slower delivery has worked for %s.", bowlerName),
            String.format("Caught and bowled! The bowler takes an absolute screamer. A shot that was middled by %s has somehow found the hands of %s.", batsmanName, bowlerName),
            String.format("That's in the air. And that's taken. Comfortable catch for the fielder. %s will need to do better next time." batsmanName)
        };
        int randomLine = (int)(Math.random()*lines.length);
        Utilities.slowPrint(lines[randomLine], 25);
    }

    /*****************
     * boundaryCommentary(): when a batsman hits a boundary, there will
     * be a slow printed commentary to make the game realistic
     */
    public static void boundaryCommentary(Player batsman, Player bowler)
    {
        String batsmanName = batsman.getName();
        String bowlerName = bowler.getName();
        String[] lines = {
            String.format("More runs! %s keeps looking to accelerate the innings.", batsmanName),
            String.format("That will be a comfortable boundary. %s is really starting to look desperate now.", bowlerName),
            String.format("What a shot! The sound off the bat is divine. You can tell %s enjoyed that.", batsmanName),
            String.format("These are crucial runs and %s knows it. %s knows he has to stop the runs from leaking.", batsmanName, bowlerName),
            String.format("%s is beginning to find himself on the crease. More vital runs for his team.", batsmanName),
            String.format("That was a poor delivery and %s has rightly punished %s. Boundary.", batsmanName, bowlerName),
            String.format("That could have been caught on the boundary. %s stares in disbelief as the fielder drops a sitter. More runs for the batting team.", bowlerName)
        };
        int randomLine = (int)(Math.random()*lines.length);
        Utilities.slowPrint(lines[randomLine], 25);
    }

    /*****************
     * playOver(): plays out an entire over bowled by a single bowler. 
     * Extras are counted, and the over can only end in the middle if all
     * wickets are taken or target is chased. Bowler must guess the same 
     * number as batsman in a given range to take a wicket.
     */
    public static void playOver(Player bowler)
    {
        // TODO
    }

    /****************
     * playInnings(): plays out an entire batting innings of 10 overs.
     * A bowler may bowl 3 overs maximum only. An inning may end abruptly
     * if either the target is chased, or all wickets are taken. It is easy
     * for players with higher batting ratings to bat and vice versa.
     */
    public static void playInnings()
    {
        // TODO
    }

    /*****************
     * playMatch(): plays out an entire match of 2 innings. The method returns 
     * winner from match to advance to next round.
     */
    public static Team playMatch(Team userTeam, Team opponent)
    {
        // TODO
        preGameCommentary(userTeam, opponent);
    }
}