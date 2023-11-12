public class Doll extends Toy {
    /**
     * Кукла
     * @param name имя игрушки
     * @param id артикул
     * @param weight вес игрушки
     * @param percent шанс выигрыша
     */
    public Doll(String name, int id, int weight, int percent) {
        super(name, id, weight, percent);
    }

    public Doll() {
        super("Barbie", 135889, 100, 30);
    }
}
