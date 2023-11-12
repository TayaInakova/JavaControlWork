import java.util.ArrayList;
import java.util.List;

/**
 * Розыгрыш игрушек
 */
public class Raffle {
    /**
     * создание каталога игрушек для розыгрыша
     * @return список игрушек, участвующих в розыгрыше
     */
    public List<Toy> catalog() {
        List<Toy> toyList = new ArrayList<>();
        SoftToy softToy = new SoftToy();
        Doll doll = new Doll();
        Robot robot = new Robot();
        toyList.add(softToy);
        toyList.add(doll);
        toyList.add(robot);
        return toyList;
    }

    /**
     * наполнение выигрышной корзины игрушками
     * @return корзина с игрушками
     */
    public Basket raffle() {
        List<Toy> list = catalog();
        Basket basket = new Basket();

        for (Toy t : list) {
            int random = (int) (Math.random() * 100);
            if (t.getPercent() <= random) {
                basket.addToy(t);
            }
        }
        return basket;
    }
}
