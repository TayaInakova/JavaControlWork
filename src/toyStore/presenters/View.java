package toyStore.presenters;

import toyStore.models.Toy;

public interface View {
    void showGiveOutPrize();

    void showResultOfAttempt(Toy toy);

    void startWords();


    void endWords();
}
