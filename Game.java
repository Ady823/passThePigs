import java.util.ArrayList;
public class Game {

    boolean game = true;
    boolean play = true;

    ArrayList<Player> gamers;
    public Game(ArrayList<Player> players) {
        gamers = players;
    }

    public void startRolling() {

        int rounds = 0; 
        while (game) {
            rounds++;

            System.out.println("Round number " + rounds);
            for (Player player : gamers) {

                if(player.wantsToRoll(player.getMyScore(), player.getHandScore(), player.getOtherScores(), player.getWinScore()) && !player.getPigOut()) {
                    player.roll();
                    if (player instanceof Robot) {
                        ((Robot)player).incrementTurn(); 
                    }

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

        System.out.println("The game is over!");
    }
}
