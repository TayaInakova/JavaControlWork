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

    public void startTheDrawing() {
        view.startWords();
        if (model.flag()) {
            Toy toy = model.tryTheLuck(model.getToyList());
            view.showResultOfAttempt(toy);
            winningBasket.addToy(toy);
        } else {
            view.endWords();
        }
    }
    
    public void endlessGame() {
        while (model.flag()) {
            startTheDrawing();
        }
    }

//    public void giveOutPrize() {
//
//    }
}
