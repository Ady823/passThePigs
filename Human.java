Scanner scan = new Scanner(System.in);
public class Human extends Player {
    public Human(String n) {
        super(n);
    }

    void humanTurn() {
        System.out.println("Type no to skip, yes to roll again");
        String roll = scan.nextLine();
        if (roll.equals("yes")) {

        } else if (roll.equals"no") {
            
        }
    }
}
