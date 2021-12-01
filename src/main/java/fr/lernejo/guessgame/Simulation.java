package fr.lernejo.guessgame;
import fr.lernejo.logger.LoggerFactory;
import fr.lernejo.logger.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;
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
            this.player.respond(false);
            this.logger.log("Plus grand");
        }
        else {
            this.player.respond(true);
            this.logger.log("Plus petit");
        }
        return false;
    }

    public void loopUntilPlayerSucceed(long nbIteration) {
        System.out.println(numberToGuess);
        long start = System.currentTimeMillis();
        for (int i=0; i < nbIteration;i++) {
            if (this.nextRound()) {
                long end = System.currentTimeMillis();
                long minute = ((end - start) / 1000)/60;
                long seconde = (end - start) / 1000;
                long miliseconde = (end - start);
                System.out.println((minute<10 ? "0"+minute : minute)+":"+(seconde<10 ? "0"+seconde : seconde)+":"+(miliseconde<100 ? miliseconde<10 ? "00"+miliseconde : "0"+miliseconde : miliseconde));
                return;
            }
        }
    }
}
