import java.util.ArrayList;
public class Game {

    boolean game = true;
    boolean play = true;

    ArrayList<Player> gamers;
    public Game(ArrayList<Player> players) {
        gamers = players;
    }

    public void startRolling() {

        while (game) {
            for (Player player : gamers) {

                while(player.wantsToRoll(player.getMyScore(), player.getHandScore(), player.getOtherScores(), player.getWinScore()) && !player.getPigOut()) {
                    player.roll();
                    ((Robot)player).incrementTurn();
                    if(player.myScore + player.handScore > player.getWinScore()) {
                        break;
                    } 
                }

                player.endTurn();

                if(player.getMyScore() >= player.getWinScore()) {
                    game = false;
                }
            }
        }
    }
}
