package fr.lernejo.guessgame;
import java.security.SecureRandom;

public class Launcher {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        long Number = random.nextInt(100);
        if (args[0].equals("-interactive")) {
            Simulation simulation = new Simulation(new HumanPlayer());
            simulation.initialize(Number);
            simulation.loopUntilPlayerSucceed(Long.MAX_VALUE);
        }
        else if (args[0].equals("-auto")) {
            Simulation simulation = new Simulation(new ComputerPlayer());
            simulation.initialize(Long.parseLong(args[1]));
            simulation.loopUntilPlayerSucceed(1000);
        }
        else {
            System.out.println("Entrez un argument :\n-interactive\n-auto avec le nombre souhaité en second argument");
        }
    }
}
