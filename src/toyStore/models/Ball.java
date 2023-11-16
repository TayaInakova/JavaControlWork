package toyStore.models;

public class Ball extends Toy {
    /**
     * Мяч
     *
     * @param name    имя игрушки
     * @param id      артикул
     * @param weight  вес игрушки
     * @param percent шанс выигрыша
     */
    public Ball(String name, int id, int weight, int percent) {
        super(name, id, weight, percent);
    }

    public Ball() {
        super("Мяч", 158828, 100, 80);
    }
}

