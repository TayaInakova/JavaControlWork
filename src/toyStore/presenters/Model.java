package toyStore.presenters;

import toyStore.models.Basket;
import toyStore.models.Toy;

import java.util.List;

public interface Model {

    Toy tryTheLuck(List<Toy> list);

    void fillBasket(Basket basket, Toy toy);

    Toy getPrize();

    void writeToFile(Toy toy);

    List<Toy> getToyList();

    boolean flag();

}
