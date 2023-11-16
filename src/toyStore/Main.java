package toyStore;

import java.util.List;

import static toyStore.Sweepstakes.startGame;
import static toyStore.Sweepstakes.giveAllToys;

public class Main {
    public static void main(String[] args) {
        List<Toy> toys = startGame();
        giveAllToys(toys);
    }
}
