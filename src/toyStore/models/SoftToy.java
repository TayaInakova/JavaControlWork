package toyStore.models;

public class SoftToy extends Toy {
    /**
     * Мягкая игрушка
     * @param name имя игрушки
     * @param id артикул
     * @param weight вес игрушки
     * @param percent шанс выигрыша
     */
    public SoftToy(String name, int id, int weight, int percent) {
        super(name, id, weight, percent);
    }

    public SoftToy() {
        super("Плюшевый мишка", 164478, 150, 40);
    }
}
