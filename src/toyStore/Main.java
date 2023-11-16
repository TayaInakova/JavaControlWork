package toyStore;

import toyStore.models.PrizeDrawingModel;
import toyStore.presenters.PrizeDrawingPresenter;
import toyStore.views.PrizeDrawingView;

public class Main {
    public static void main(String[] args) {
        PrizeDrawingModel model = new PrizeDrawingModel();
        PrizeDrawingView view = new PrizeDrawingView();
        PrizeDrawingPresenter presenter = new PrizeDrawingPresenter(model, view);
        presenter.endlessGame();
        presenter.giveOutPrizeFromWinningBasket();
    }
}
