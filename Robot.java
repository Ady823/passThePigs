import java.util.ArrayList;

public class Robot extends Player {
   String strategy;
   int turn = 0;


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
            }
        } else if(strategy.equals("Risky")) {
            roll = true;
        }
        return roll;
    }


 

}