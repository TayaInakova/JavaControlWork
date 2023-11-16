package toyStore.presenters;

import toyStore.models.Basket;
import toyStore.models.Toy;

public class PrizeDrawingPresenter {
    private final Model model;
    private final View view;
    private final Basket winningBasket;

    public PrizeDrawingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.winningBasket = new Basket();
    }

    public boolean startTheDrawing() {
        view.startWords();
        if (model.flag()) {
            Toy toy = model.tryTheLuck(model.getToyList());
            view.showResultOfAttempt(toy);
            winningBasket.addToy(toy);
            giveOutPrizeNow(toy);
            return true;
        } else {
            return false;
        }
    }

    public void endlessGame() {
        view.startEndlessGameWord();
        boolean button = model.pressButton();
        while (button) {
            button = startTheDrawing();
        }
    }

    public void giveOutPrizeNow(Toy toy) {
        System.out.println("Желаете получить приз? Если да - нажмите \"*\"");
        if (model.pressButton()) {
            model.writeToFile(toy);
            winningBasket.removeToy(toy);
            view.showGiveOutPrize();
        }
    }

    public void giveOutPrizeFromWinningBasket() {
        if (!winningBasket.getContainer().isEmpty()) {
            view.showBasketIsNoEmpty();
            for (Toy nextToy : winningBasket.getContainer()) {
                System.out.println(nextToy.getName());
                giveOutPrizeNow(nextToy);
            }
        } else {
            view.showBasketIsEmpty();
        }
        view.endWords();
    }
}
