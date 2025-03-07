import java.util.ArrayList;

public class PassThePigs {
    public static void main (String [] args) {
        System.out.println("Welcome to Pass the Pigs!");

        ArrayList<Player> players = new ArrayList<Player>(); 
        Player player1 = new Robot("riskyBot", "Risky");
        Player player2 = new Robot("wimpyBot", "Wimpy");
        Player player3 = new Robot("genericBot", "Generic");
        players.add(player1);
        players.add(player2);
        players.add(player3);

        Game passingPiggies = new Game(players);
        passingPiggies.startRolling();

        //player1.roll();
        //player2.roll();
        //QQplayer3.roll();
    }
}