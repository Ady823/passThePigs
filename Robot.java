import java.util.ArrayList;

public class Robot extends Player {
   String strategy;
   int turn = 0;

   public void incrementTurn() {
        turn++;
   }

    public Robot(String n, String s) {
        super(n);
        strategy = s;
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        boolean roll = false;
        if(turn == 0) {
            return true;
        }

        if(strategy.equals("Generic")) {
            if (handScore < 20) {
                roll = true;
            } else {
                roll = false;
                endTurn();
            }
        } else if(strategy.equals("Risky")) {
            roll = true;
        } else if(strategy.equals("Wimpy")) {
            roll = false;
        }
        return roll;
    }
}