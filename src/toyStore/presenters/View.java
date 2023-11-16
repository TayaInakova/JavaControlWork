package toyStore.presenters;

import toyStore.models.Toy;

public interface View {
    void startEndlessGameWord();
    void startWords();
    void showResultOfAttempt(Toy toy);
    void showGiveOutPrize();
    void showBasketIsNoEmpty();
    void showBasketIsEmpty();
    void endWords();
    void endGame();

}
