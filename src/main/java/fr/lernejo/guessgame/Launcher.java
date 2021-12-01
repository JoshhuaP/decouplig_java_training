package fr.lernejo.guessgame;
import java.security.SecureRandom;

public class Launcher {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        long Number = random.nextInt(100);
        Simulation simulation = new Simulation(new HumanPlayer());
        simulation.initialize(Number);
        simulation.loopUntilPlayerSucceed();
    }
}
