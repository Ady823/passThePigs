import java.util.ArrayList;
import java.util.Scanner;

public class Human extends Player {

    public Human(String n) {
        super(n);
    }

    public void humanTurn() {
        
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        boolean willRoll = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type no to skip, yes to roll again");
        String roll = scan.nextLine();

        if(roll.equals("yes")) {
            willRoll = true;
        } else if(roll.equals("no")) {
            willRoll = false;
        }
        return willRoll;
    }
}
