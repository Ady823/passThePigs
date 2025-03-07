import java.util.ArrayList;
public class Game {

    ArrayList<Player> gamers;
    public Game(ArrayList<Player> players){
        gamers = players;

    }

    public void startRolling() {
        for (Player i : gamers) {

            while(i.wantsToRoll(i.getMyScore(), i.getHandScore(), i.getOtherScores(), i.getWinScore())) {
                i.roll();
            }
            i.endTurn();


        }
    }
}
