public class Robot extends Toy{
    /**
     * Робот
     * @param name имя игрушки
     * @param id артикул
     * @param weight вес игрушки
     * @param percent шанс выигрыша
     */
    public Robot(String name, int id, int weight, int percent) {
        super(name, id, weight, percent);
    }

    public Robot() {
        super("Robot", 152228, 200, 40);
    }
}
