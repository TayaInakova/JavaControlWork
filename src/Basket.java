import java.util.ArrayList;

/**
 * корзина с выигранными игрушками
 */
public class Basket {
    private ArrayList<Toy> container;

    public Basket(ArrayList<Toy> container) {
        this.container = container;
    }

    public Basket() {
        this.container = new ArrayList<>();
    }

    public ArrayList<Toy> getContainer() {
        return container;
    }

    public void setContainer(ArrayList<Toy> container) {
        this.container = container;
    }

    /**
     * @param toy игрушка, которую надо добавить в козину
     * @return обновлённая корзина
     */
    public ArrayList<Toy> addToy(Toy toy) {
        this.container.add(toy);
        return container;
    }

    /**
     * @param toy игрушка, которую надо убрать из козины
     * @return обновлённая корзина
     */
    public ArrayList<Toy> removeToy(Toy toy) {
        this.container.remove(toy);
        return container;
    }

    @Override
    public String toString() {
        return "Basket{" + container +
                '}';
    }
}
