package fr.lernejo.guessgame;
import fr.lernejo.logger.LoggerFactory;
import fr.lernejo.logger.Logger;
import java.util.Scanner;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private long numberToGuess;

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        //TODO implement me
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int number = scanner.nextInt();
        if (number == numberToGuess) {
            return true;
        }
        else if (number < numberToGuess) {
            System.out.println("Plus grand");
            this.logger.log("Plus grand");
        }
        else {
            System.out.println("Plus petit");
            this.logger.log("Plus petit");
        }
        return false;
    }

    public void loopUntilPlayerSucceed() {
        while (!nextRound());
    }
}
