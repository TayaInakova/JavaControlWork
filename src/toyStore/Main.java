package toyStore;

import toyStore.models.Basket;
import toyStore.models.PrizeDrawingModel;
import toyStore.presenters.PrizeDrawingPresenter;
import toyStore.views.PrizeDrawingView;

public class Main {
    public static void main(String[] args) {
        PrizeDrawingModel model = new PrizeDrawingModel();
        PrizeDrawingView view = new PrizeDrawingView();
        PrizeDrawingPresenter presenter = new PrizeDrawingPresenter(model, view);
        presenter.startTheDrawing();
//        Toy playerPrize = model.getPrize();
//        model.fillBasket(basket, playerPrize);
//        System.out.println(playerPrize);
    }
}
