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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Match {

    // MATCH VARIABLES
    private static int currentRuns;
    private static int currentWickets;
    private static int inningsBallsBowled;
    private static Player currentBowler;
    private static Player currentStriker;
    private static Player currentNonStriker;
    private static int target;
    private static boolean isFirstInnings = true;
    private static boolean isBattingFirst = false;
    private static Team battingTeam;
    private static Team bowlingTeam;
    private static boolean userWin = false;
    private static ArrayList<Player> availableBatters;
    private static ArrayList<Player> availableBowlers;

    private static Scanner s = new Scanner(System.in);

    /****************
     * preGameCommentary(): before a match starts, there will always
     * be a commentary to build anticipation and thrill
     */
    public static void preGameCommentary(Team userTeam, Team opponent) {
        String[] lines = {
                String.format(
                        "It's the match everybody is talking about. %s takes on %s in what could be a turning point in this year's T10 World Cup.",
                        opponent.getName(), userTeam.getName()),
                String.format(
                        "And here we go. Tonight's match between %s and %s is one that looks quite promising. The thrill in the stadium is intense as both sets of fans roar their chants.",
                        userTeam.getName(), opponent.getName()),
                String.format(
                        "Well there has been quite a lot of controversy surrounding this match. After brief physical altercations between both captains, %s and %s will finally meet each other on the pitch.",
                        opponent.getName(), userTeam.getName()),
                String.format(
                        "Only a few sporting rivalries come close to this one. Both %s and %s are willing to give it all in this elimination match.",
                        userTeam.getName(), opponent.getName()),
                String.format(
                        "Well, what can we say. It's the match everybody is talking about. Cricket fans around the globe have been anticipating the fixture between %s and %s, and here it is.",
                        userTeam.getName(), opponent.getName()),
                String.format(
                        "Quite a lot of anticipation surrounding tonight's match as 2 great cricketing nations, %s and %s, take on each other in a vital fixture in this year's World Cup.",
                        userTeam.getName(), opponent.getName())
        };
        int randomLine = (int) (Math.random() * lines.length);
        Utilities.slowPrint(lines[randomLine], 40);
    }

    /****************
     * wicketCommentary(): when a wicket is taken, there will
     * be a slow printed commentary to make the game realistic
     */
    public static void wicketCommentary(Player bowler, Player batsman) {
        String bowlerName = bowler.getName();
        String batsmanName = batsman.getName();
        String[] lines = {
                String.format("He's got him! %s breaks through the defenses of %s and a vital wicket has fallen!",
                        bowlerName, batsmanName),
                String.format("Oh what a beauty! %s stares in astonishment as %s has produced an absolute jaffer!",
                        batsmanName, bowlerName),
                String.format(
                        "Right in the blockhole! %s bowls a perfect yorker and there is nothing %s could have done about it. Wonderful delivery.",
                        bowlerName, batsmanName),
                String.format(
                        "The bails go off! Wonderful line and length from %s as he takes the crucial wicket of %s.",
                        bowlerName, batsmanName),
                String.format(
                        "What an outstanding catch by the wicket-keeper! %s will be delighted to get the wicket. Surely one of the best catches of the tournament as the keeper dives and stretches to his right.",
                        bowlerName),
                String.format(
                        "Oh no! That is a terrible shot selection from %s. %s is laughing histerically as he can't believe what he's just seen!",
                        batsmanName, bowlerName),
                String.format(
                        "Stumped! A piece of tactical brilliance as the wicket-keeper steps forward. The slower delivery has worked for %s.",
                        bowlerName),
                String.format(
                        "Caught and bowled! The bowler takes an absolute screamer. A shot that was middled by %s has somehow found the hands of %s.",
                        batsmanName, bowlerName),
                String.format(
                        "That's in the air. And that's taken. Comfortable catch for the fielder. %s will need to do better next time.",
                        batsmanName)
        };
        int randomLine = (int) (Math.random() * lines.length);
        Utilities.slowPrint(lines[randomLine], 25);
    }

    /*****************
     * boundaryCommentary(): when a batsman hits a boundary, there will
     * be a slow printed commentary to make the game realistic
     */
    public static void boundaryCommentary(Player batsman, Player bowler) {
        String batsmanName = batsman.getName();
        String bowlerName = bowler.getName();
        String[] lines = {
                String.format("More runs! %s keeps looking to accelerate the innings.", batsmanName),
                String.format("That will be a comfortable boundary. %s is really starting to look desperate now.",
                        bowlerName),
                String.format("What a shot! The sound off the bat is divine. You can tell %s enjoyed that.",
                        batsmanName),
                String.format("These are crucial runs and %s knows it. %s knows he has to stop the runs from leaking.",
                        batsmanName, bowlerName),
                String.format("%s is beginning to find himself on the crease. More vital runs for his team.",
                        batsmanName),
                String.format("That was a poor delivery and %s has rightly punished %s. Boundary.", batsmanName,
                        bowlerName),
                String.format(
                        "That could have been caught on the boundary. %s stares in disbelief as the fielder drops a sitter. More runs for the batting team.",
                        bowlerName)
        };
        int randomLine = (int) (Math.random() * lines.length);
        Utilities.slowPrint(lines[randomLine], 25);
    }

    /*****************
     * bowlOver(): plays out an entire over bowled by a single bowler.
     * Extras are counted, and the over can only end in the middle if all
     * wickets are taken or target is chased. Bowler must guess the same
     * number as batsman in a given range to take a wicket.
     */
    private static void bowlOver() {
        // TODO
        int userGuess = 0;
        int compGuess = 0;
        int thresholdMin = 1;
        int thresholdMax = 0;
        int ballsBowled = 0;
        do {
            displayScorecard();
            // thresholdMin = determineThreshold()[0];
            thresholdMax = determineThreshold();
            System.out.printf("%s to %s. %n", currentBowler.getName(), currentStriker.getName());
            compGuess = (int) (Math.random() * thresholdMax + thresholdMin);
            System.out.println(compGuess); // for testing purposes
            userGuess = Utilities.inputInt("Enter number between " + thresholdMin + " and " + thresholdMax + ": ",
                    thresholdMin, thresholdMax);
            System.out.printf("%s entered %s. %n", currentStriker.getName(), compGuess);
            if (userGuess == compGuess) {
                currentWickets += 1;
                currentBowler.incrementMatchBallsBowled();
                currentBowler.incrementMatchWickets();
                currentStriker.incrementMatchBallsBatted();
                wicketCommentary(currentBowler, currentStriker);

                /*
                 * David Warner - 20(10)
                 * Dismissed by Jasprit Bumrah
                 * Press the enter key to continue >
                 * 
                 * 
                 * Matthew Wade on strike.
                 */
                System.out.println("\n\n"); // 3 newlines
                System.out.printf("%s - %s(%s) %n", currentStriker.getName(), currentStriker.getMatchRunsScored(),
                        currentStriker.getMatchBallsBatted());
                System.out.printf("Dismissed by %s. %n", currentBowler.getName());
                System.out.print("Press the enter key to continue > ");
                s.nextLine();
                System.out.println("\n\n"); // 3 newlines
                if (currentWickets < 10) {
                    currentStriker = getBestBatsman();
                    System.out.printf("%s on strike. %n", currentStriker.getName());
                    if (ballsBowled == 5) {
                        switchStrike();
                    }
                }
                if (currentWickets == 10) {
                    // currentStriker = bowlingTeam.getTeam().get((int)(Math.random()*11+1)); //
                    // ignore
                    currentStriker = null;
                }
            } else // add runs to tally
            {
                currentRuns += compGuess;
                currentBowler.incrementMatchBallsBowled();
                currentBowler.addMatchRunsConceded(compGuess);
                currentStriker.incrementMatchBallsBatted();
                currentStriker.addMatchRunsScored(compGuess);
                if (compGuess == 4 || compGuess == 6) {
                    boundaryCommentary(currentStriker, currentBowler);
                }
                if (compGuess % 2 == 1) // if odd number was entered
                {
                    switchStrike();
                }
                if (compGuess % 2 == 0 && ballsBowled == 5) // switch strike at end of overs
                {
                    switchStrike();
                }
            }
            ballsBowled += 1;
            inningsBallsBowled += 1;
            if (!isFirstInnings && currentRuns >= target) {
                break; // target has been chased
            }

        } while (currentWickets < 10 && ballsBowled < 6);
        switchStrike();
    }

    /****************
     * bowlInnings(): plays out an entire batting innings of 10 overs.
     * A bowler may bowl 3 overs maximum only. An inning may end abruptly
     * if either the target is chased, or all wickets are taken. It is easy
     * for players with higher batting ratings to bat and vice versa.
     */
    private static void bowlInnings(Team userTeam, Team opponent) {
        // TODO
        battingTeam = opponent;
        bowlingTeam = userTeam;
        availableBatters = Utilities.copyList(battingTeam.getTeam());
        availableBowlers = Utilities.copyList(bowlingTeam.getTeam());

        currentRuns = 0;
        currentWickets = 0;
        inningsBallsBowled = 0;

        currentStriker = getBestBatsman();
        currentNonStriker = getBestBatsman();
        // currentBowler = getBestBowler(); // always starts with best rated bowler;
        currentBowler = pickBowler(currentNonStriker); // ignore parameter
        do {
            bowlOver();
            if (!isFirstInnings && currentRuns > target) // target has been chased
            {
                break;
            }
            battingCard();
            // bowlingCard();
            Utilities.slowPrint("\n", 100);
            displayScorecard();
            if (inningsBallsBowled < 60 && currentWickets < 10) {
                currentBowler = pickBowler(currentBowler);
            }
        } while (inningsBallsBowled < 60 && currentWickets < 10);

        if (isFirstInnings) {
            target = currentRuns + 1;
        } else {
            if (currentRuns >= target) {
                userWin = false;
            } else if (currentRuns == (target - 1)) {
                // super over
            } else {
                userWin = true;
            }
        }

    }

    private static void batOver() {
        int userGuess = 0;
        int compGuess = 0;
        int thresholdMin = 1;
        int thresholdMax = 0;
        int ballsBowled = 0;

        do {
            displayScorecard();
            // thresholdMin = determineThreshold()[0];
            thresholdMax = determineThreshold();
            System.out.printf("%s to %s. %n", currentBowler.getName(), currentStriker.getName());
            compGuess = (int) (Math.random() * thresholdMax + thresholdMin);
            System.out.println(compGuess); // for testing purposes
            userGuess = Utilities.inputInt("Enter number between " + thresholdMin + " and " + thresholdMax + ": ",
                    thresholdMin, thresholdMax);
            System.out.printf("%s entered %s. %n", currentBowler.getName(), compGuess);
            if (userGuess == compGuess) {
                currentWickets += 1;
                currentBowler.incrementMatchBallsBowled();
                currentBowler.incrementMatchWickets();
                currentStriker.incrementMatchBallsBatted();
                wicketCommentary(currentBowler, currentStriker);

                /*
                 * David Warner - 20(10)
                 * Dismissed by Jasprit Bumrah
                 * Press the enter key to continue >
                 * 
                 * 
                 * Matthew Wade on strike.
                 */
                System.out.println("\n\n"); // 3 newlines
                System.out.printf("%s - %s(%s) %n", currentStriker.getName(), currentStriker.getMatchRunsScored(),
                        currentStriker.getMatchBallsBatted());
                System.out.printf("Dismissed by %s. %n", currentBowler.getName());
                System.out.print("Press the enter key to continue > ");
                s.nextLine();
                System.out.println("\n\n"); // 3 newlines
                if (currentWickets < 10) {
                    currentStriker = pickBatsman();
                    System.out.printf("%s on strike. %n", currentStriker.getName());
                    if (ballsBowled == 5) {
                        switchStrike();
                    }
                }
                if (currentWickets == 10) {
                    // currentStriker = bowlingTeam.getTeam().get((int)(Math.random()*11+1)); //
                    // ignore
                    currentStriker = null;
                }
            } else // add runs to tally
            {
                currentRuns += userGuess;
                currentBowler.incrementMatchBallsBowled();
                currentBowler.addMatchRunsConceded(userGuess);
                currentStriker.incrementMatchBallsBatted();
                currentStriker.addMatchRunsScored(userGuess);
                if (userGuess == 4 || userGuess == 6) {
                    boundaryCommentary(currentStriker, currentBowler);
                }
                if (userGuess % 2 == 1) // if odd number was entered
                {
                    switchStrike();
                }
                if (userGuess % 2 == 0 && ballsBowled == 5) // switch strike at end of overs
                {
                    switchStrike();
                }
            }
            ballsBowled += 1;
            inningsBallsBowled += 1;
            if (!isFirstInnings && currentRuns >= target) {
                break; // target has been chased
            }

        } while (currentWickets < 10 && ballsBowled < 6);
        switchStrike();
    }

    private static void batInnings(Team userTeam, Team opponent) {
        battingTeam = userTeam;
        bowlingTeam = opponent;
        availableBatters = Utilities.copyList(battingTeam.getTeam());
        availableBowlers = Utilities.copyList(bowlingTeam.getTeam());

        currentRuns = 0;
        currentWickets = 0;
        inningsBallsBowled = 0;

        currentStriker = pickBatsman();
        currentNonStriker = pickBatsman();
        // currentBowler = getBestBowler(); // always starts with best rated bowler;
        currentBowler = getBestBowler(currentStriker); // ignore parameter
        do {
            batOver();
            if (!isFirstInnings && currentRuns > target) // target has been chased
            {
                break;
            }
            battingCard();
            bowlingCard();
            Utilities.slowPrint("\n", 100);
            displayScorecard();
            if (inningsBallsBowled < 60 && currentWickets < 10) {
                currentBowler = getBestBowler(currentBowler);
            }
        } while (inningsBallsBowled < 60 && currentWickets < 10);

        if (isFirstInnings) {
            target = currentRuns + 1;
        } else {
            if (currentRuns >= target) {
                userWin = true;
            } else if (currentRuns == (target - 1)) {
                // super over
            } else {
                userWin = false;
            }
        }
    }

    /*****************
     * playMatch(): plays out an entire match of 2 innings. The method returns
     * winner from match to advance to next round.
     */
    public static Team playMatch(Team userTeam, Team opponent) {
        // TODO
        preGameCommentary(userTeam, opponent);
        System.out.println("\n\n"); // 3 newlines
        toss(userTeam, opponent);
        Utilities.slowPrint("\n", 1000);
        System.out.println("\n\n"); // 3 newlines
        if (isBattingFirst) {
            isFirstInnings = true;
            batInnings(userTeam, opponent);
            Utilities.slowPrint(String.format("%s has set a target of %s.%n", userTeam.getName(), target), 20);
            isFirstInnings = false;
            bowlInnings(userTeam, opponent);
        } else {
            isFirstInnings = true;
            bowlInnings(userTeam, opponent);
            Utilities.slowPrint(String.format("%s has set a target of %s.%n", opponent.getName(), target), 20);
            isFirstInnings = false;
            batInnings(userTeam, opponent);
        }

        if (userWin) 
        {
            System.out.printf("%s wins against %s. Congratulations. %n", userTeam.getName(), opponent.getName());
            return userTeam;
        } else 
        {
            System.out.printf("%s wins against %s. Commiserations. %n", opponent.getName(), userTeam.getName());
            return opponent;
        }
    }

    // PRIVATE METHODS

    private static void toss(Team userTeam, Team opponent) {
        int toss = 0;
        int coinFlip = (int) (Math.random() * 2 + 1);
        int decision = 0;

        Utilities.slowPrint("Both captains are on the ground for the toss.\n", 20);
        toss = Utilities.inputInt("Your call. Heads(1) or tails(2): ", 1, 2);
        if (toss == coinFlip) {
            decision = Utilities.inputInt("You have won the toss. Bat(1) or bowl(2): ", 1, 2);
            if (decision == 1) {
                System.out.printf("%s has decided to bat. %n", userTeam.getName());
                isBattingFirst = true;
            } else {
                System.out.printf("%s has decided to bowl. %n", userTeam.getName());
                isBattingFirst = false;
            }
        } else // lost the toss
        {
            System.out.println("You have lost the toss.");
            decision = (int) (Math.random() * 2 + 1);
            if (decision == 1) {
                System.out.printf("%s has decided to bat. %n", opponent.getName());
                isBattingFirst = false;
            } else {
                System.out.printf("%s has decided to bowl. %n", opponent.getName());
                isBattingFirst = true;
            }
        }
        Utilities.inputString("Press the enter key to continue> ");
    }

    private static int determineThreshold() {
        int bowlerRating = currentBowler.getBowlingRating();
        int batterRating = currentStriker.getBattingRating();
        int ratingDifference = bowlerRating - batterRating;
        int threshold = 0;

        if (ratingDifference < 15 && ratingDifference >= -15) 
        {
            threshold = 6;
        } 
        else if (ratingDifference >= 15 && ratingDifference < 25) 
        {
            threshold = 5;
        } 
        else if (ratingDifference >= 25 && ratingDifference < 35) 
        {
            threshold = 4;
        } 
        else if (ratingDifference >= 35) 
        {
            threshold = 3;
        }

        // if none of those cases work, then the batsman is clearly better
        // than the bowler. we will reassign the variable ratingDifference
        else if (ratingDifference < -15 && ratingDifference >= -25) 
        {
            threshold = 7;
        } 
        else if (ratingDifference < -25 && ratingDifference >= -35) 
        {
            threshold = 8;
        } 
        else if (ratingDifference <= -35) 
        {
            threshold = 9;
        }
        return threshold;
    }

    private static Player getBestBatsman() {
        int rating = 0;
        int index = 0;
        for (int i = 0; i < availableBatters.size(); i++) {
            if (availableBatters.get(i).getBattingRating() > rating) {
                rating = availableBatters.get(i).getBattingRating();
                index = i;
            }
        }
        Player batsman = availableBatters.get(index);
        availableBatters.remove(batsman);
        return batsman;
    }

    private static Player getBestBowler(Player previousBowler) {
        int rating = 0;
        int index = 0;
        for (int i = 0; i < 11; i++) {
            Player p = availableBowlers.get(i);
            if (p.getBowlingRating() > rating && !p.getName().equals(previousBowler.getName())
                    && p.getMatchBallsBowled() < 18) {
                rating = availableBowlers.get(i).getBowlingRating();
                index = i;
            }
        }
        Player bowler = availableBowlers.get(index);
        // availableBatters.remove(bowler);
        return bowler;
    }

    private static void switchStrike() {
        Player player1 = currentStriker;
        Player player2 = currentNonStriker;
        currentStriker = player2;
        currentNonStriker = player1;
    }

    private static void displayScorecard() {
        /*
         * India: 78/2 (5.1)
         * =======================================
         * Virat Kohli - 34 (14)*
         * Shivam Dube - 4 (3)
         * =======================================
         * Pat Cummins - 2/11 (2.1)
         * =======================================
         * 125 needed off 48 deliveries
         * =======================================
         */
        System.out.println("\n\n"); // 3 newlines
        System.out.printf("%s: %s/%s (%s.%s) %n", battingTeam.getName(), currentRuns, currentWickets,
                inningsBallsBowled / 6, inningsBallsBowled % 6);
        System.out.println("=======================================");
        if (currentStriker != null) {
            System.out.printf("%s - %s (%s)* %n", currentStriker.getName(), currentStriker.getMatchRunsScored(),
                    currentStriker.getMatchBallsBatted());
        }
        System.out.printf("%s - %s (%s) %n", currentNonStriker.getName(), currentNonStriker.getMatchRunsScored(),
                currentNonStriker.getMatchBallsBatted());
        System.out.println("=======================================");
        System.out.printf("%s - %s/%s (%s.%s) %n", currentBowler.getName(), currentBowler.getMatchWickets(),
                currentBowler.getMatchRunsConceded(), currentBowler.getMatchBallsBowled() / 6,
                currentBowler.getMatchBallsBowled() % 6);
        if (!isFirstInnings) {
            System.out.println("=======================================");
            System.out.printf("%s needed off %s deliveries. %n", target - currentRuns, 60 - inningsBallsBowled);
        }
        System.out.println("=======================================");
    }

    private static void battingCard() {
        System.out.println();
        /*
         * Name Runs Balls Strike Rate Batting% Overall Rating
         * David Warner 21 12 175.00 88 89 NOT OUT
         * 
         */
        System.out.println("============================================");
        System.out.printf("%-40s%-10s%-10s%-15s%-10s%-20s%n", "Name", "Runs", "Balls", "Strike Rate", "Batting%",
                "Overall Rating");
        for (int i = 0; i < battingTeam.getTeam().size(); i++) {
            Player p = battingTeam.getTeam().get(i);
            double strikeRate = 0.00;
            if (p.getMatchBallsBatted() > 0) // prevent division by 0
            {
                strikeRate = (p.getMatchRunsScored() + 0.0) / p.getMatchBallsBatted();
                strikeRate *= 100;
            }
            System.out.printf("%-40s%-10s%-10s%-15.2f%-10s%-20s", p.getName(), p.getMatchRunsScored(),
                    p.getMatchBallsBatted(), strikeRate, p.getBattingRating(), p.getOverallRating());

            if ((currentNonStriker != null) && (p.getName().equals(currentStriker.getName())
                    || p.getName().equals(currentNonStriker.getName()))) {
                System.out.print("NOT OUT");
            } else {
                if (p.getMatchBallsBatted() > 0) {
                    System.out.print("OUT");
                }
            }
            System.out.println(); // newline
        }
        System.out.println("============================================");
        System.out.print("Press the enter key to advance> ");
        s.nextLine();

    }

    private static void bowlingCard() {
        System.out.println("============================================");
        System.out.printf("%-40s%-10s%-10s%-10s%-10s%-10s%s %n", "Name", "Overs", "Wickets", "Runs", "Economy",
                "Bowling%", "Overall Rating");
        for (int i = 0; i < availableBowlers.size(); i++) {
            Player p = availableBowlers.get(i);
            double economy = 0.00;
            if (p.getMatchBallsBowled() > 0) // preventing division by 0.
            {
                economy = ((p.getMatchRunsConceded() + 0.0) / p.getMatchBallsBowled()) * 6;
            }
            System.out.printf("%-40s%s.%-8s%-10s%-10s%-10.2f%-10s%-10s %n", p.getName(), p.getMatchBallsBowled() / 6,
                    p.getMatchBallsBowled() % 6, p.getMatchWickets(), p.getMatchRunsConceded(), economy,
                    p.getBowlingRating(), p.getOverallRating());
        }
        System.out.println("============================================");
        System.out.print("Press the enter key to advance> ");
        s.nextLine();
    }

    private static Player pickBowler(Player previousBowler) {
        int bowlerIndex = 0;
        Player bowler;
        /*
         * Name Overs Wickets Runs Economy Bowling % Overall Rating
         * 1. David Warner 0.0 0 0 0.00 55 89
         * 2. Pat Cummins 3.0 2 17 5.67 92 92
         * 3. Ashton Agar 1.0 0 11 11.00 87 86
         * 4. Josh Hazelwood 2.0 2 22 11.00 90 90
         */
        System.out.println("\n\n"); // 3 newlines
        do {
            System.out.println("============================================");
            System.out.printf("%-10s%-40s%-10s%-10s%-10s%-10s%-10s%s %n", "No.", "Name", "Overs", "Wickets", "Runs",
                    "Economy", "Bowling%", "Overall Rating");
            for (int i = 0; i < availableBowlers.size(); i++) {
                Player p = availableBowlers.get(i);
                double economy = 0.00;
                if (p.getMatchBallsBowled() > 0) // preventing division by 0.
                {
                    economy = ((p.getMatchRunsConceded() + 0.0) / p.getMatchBallsBowled()) * 6;
                }
                System.out.printf("%-10s%-40s%s.%-8s%-10s%-10s%-10.2f%-10s%-10s %n", i + 1, p.getName(),
                        p.getMatchBallsBowled() / 6, p.getMatchBallsBowled() % 6, p.getMatchWickets(),
                        p.getMatchRunsConceded(), economy, p.getBowlingRating(), p.getOverallRating());
            }
            System.out.println("============================================");
            bowlerIndex = Utilities.inputInt("Enter no. to pick bowler: ", 1, availableBowlers.size());
            bowler = availableBowlers.get(bowlerIndex - 1);

            // check if bowler is eligible to bowl next over
            if (bowler.getName().equals(previousBowler.getName())) {
                System.out.println(
                        "The same bowler can not bowl a second consecutive over. You must pick another bowler.");
            } else if (bowler.getMatchBallsBowled() >= 18) // bowler has already bowled 3 overs
            {
                System.out.println("Bowlers can bowl a maximum of 3 overs.");
            }
        } while (bowler.getName().equals(previousBowler.getName()) || bowler.getMatchBallsBowled() >= 18);

        return bowler;
    }

    private static Player pickBatsman() {
        int batsmanIndex = 0;
        Player batsman;
        /*
         * 1. Virat Kohli 92 92
         * 2. Shubman Gill 89 90
         * 3. Shivam Dube 86 85
         */
        System.out.println("\n\n"); // 3 newlines
        System.out.println("============================================");
        System.out.printf("%-10s%-40s%-10s%s %n", "No.", "Name", "Batting %", "Overall Rating");
        for (int i = 0; i < availableBatters.size(); i++) {
            Player p = availableBatters.get(i);
            System.out.printf("%-10s%-40s%-10s%s %n", i + 1, p.getName(), p.getBattingRating(), p.getOverallRating());
        }
        System.out.println("============================================");
        batsmanIndex = Utilities.inputInt("Enter no. to pick next batsman: ", 1, availableBatters.size());
        batsman = availableBatters.get(batsmanIndex - 1);
        availableBatters.remove(batsmanIndex - 1);
        return batsman;
    }
}