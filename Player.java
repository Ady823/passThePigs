import java.util.ArrayList;
public class Player {
    private String name;
    private int winScore = 100;
    private String strat;
    public int handScore = 0;
    public int myScore = 0;
    private boolean pigOut = false;
    ArrayList<Integer> otherScores = new ArrayList<Integer>();
    int winningScore = 100;

    public Player(String name) {
        this.name = name; 
    }
    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore){
        boolean roll = false;
        return roll;
    }
    public String getName(){
        return name;
    }
    public String getStrategy(){
        String strat = " ";
        return strat;
    }

    public void roll() {
        pigOut = false;
        String pig1 = " ";
        String pig2 = " ";
        double chance1;
        double chance2;
        if(wantsToRoll(myScore, handScore, otherScores, winningScore) == true) {
            chance1 = Math.random() * 100 + Math.random(); //returns a value up to 99.99
            chance2 = Math.random() * 100 + Math.random();

            if (chance1 <= 34.9) {
                pig1 = "dot";
            } else if (chance1 <= 65.1) {
                pig1 = "no dot";
            } else if (chance1 <= 87.5) {
                pig1 = "razorback";
            } else if (chance1 <= 96.3) {
                pig1 = "trotter";
            } else if (chance1 <= 99.3) {
                pig1 = "snouter";
            } else {
                pig1 = "leaning jowler";
            }

            if (chance2 <= 34.9) {
                pig2 = "dot";
            } else if (chance2 <= 65.1) {
                pig2 = "no dot";
            } else if (chance2 <= 87.5) {
                pig2 = "razorback";
            } else if (chance2 <= 96.3) {
                pig2 = "trotter";
            } else if (chance2 <= 99.3) {
                pig2 = "snouter";
            } else {
                pig2 = "leaning jowler";
            }
        } else {
            endTurn();
        }
        handScore += givePoints(pig1, pig2);
        System.out.println(handScore + ", " + myScore);
    }

    public void endTurn() {
        myScore += handScore;
        handScore = 0;
    }

    public int givePoints(String pig1, String pig2) {
        int points = 0;
        if (pig1.equals("dot") && pig2.equals("no dot") || pig1.equals("no dot") && pig2.equals("dot")){
            System.out.println("Pig Out!");
            handScore = 0;
            endTurn();
            pigOut = true;
            return 0;
        }
        if (pig1.equals("dot") && pig2.equals("dot") ) {
            points = 1;
        } else if(pig1.equals("no dot") && pig2.equals("no dot")) {
            points = 1;
        } else {
            if (pig1.equals("razorback")) {
                points += 5;
            } else if (pig1.equals("trotter")) {
                points += 5;
            } else if (pig1.equals("snouter")) {
                points += 10;
            } else if (pig1.equals("leaning jowler")) {
                points += 15;
            }

            if (pig2.equals("razorback")) {
                points += 5;
            } else if (pig2.equals("trotter")) {
                points += 5;
            } else if (pig2.equals("snouter")) {
                points += 10;
            } else if (pig2.equals("leaning jowler")) {
                points += 15;
            }
            

            if (pig1.equals(pig2)){
                points = points * 4;
            }
        }
        return points;
    }

    public int getMyScore(){
        return myScore;
    }

    public int getHandScore() {
        return handScore;
    }

    public int getWinScore() {
        return winScore;
    }

    public ArrayList<Integer> getOtherScores() {
        return otherScores;
    }

    public boolean getPigOut() {
        return pigOut;
    }
}
