package toyStore.presenters;

import toyStore.models.Toy;

import java.util.List;

public interface Model {

    List<Toy> getToyList();

    boolean pressButton();

    boolean flag();

    boolean pressGiveOutPrizeButton();
    boolean exitTheGameButton();

    Toy tryTheLuck(List<Toy> list);

    void writeToFile(Toy toy);

}
