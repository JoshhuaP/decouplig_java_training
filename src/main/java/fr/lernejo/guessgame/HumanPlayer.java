package fr.lernejo.guessgame;
import fr.lernejo.logger.LoggerFactory;
import fr.lernejo.logger.Logger;
import java.util.Scanner;

public class HumanPlayer implements Player {
    private final Logger logger = LoggerFactory.getLogger("player");
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public long askNextGuess() {
        System.out.println("Entrez un nombre");
        String number = scanner.nextLine();
        return 0;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater) {
            System.out.println("Plus petit");
        }
        else {
            System.out.println("Plus grand");
        }
    }
}
