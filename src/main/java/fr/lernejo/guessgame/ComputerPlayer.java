package fr.lernejo.guessgame;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.security.SecureRandom;

public class ComputerPlayer implements Player{
    private final Logger logger = LoggerFactory.getLogger("player");
    long min = 0;
    long max = Long.MAX_VALUE;
    long valeurTeste = 0;
    @Override
    public long askNextGuess() {
        valeurTeste = ((max-min)/2)+min;
        return valeurTeste;
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
