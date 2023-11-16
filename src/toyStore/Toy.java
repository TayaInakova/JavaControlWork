package toyStore;

public class Toy{
    private final String name;
    private final int id;
    private final int percent;

    /**
     * @param name     название игрушки
     * @param id       артикул
     * @param percent  процент выпадания
     */
    public Toy(String name, int id, int percent) {
        this.name = name;
        this.id = id;
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nToy{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", percent=" + percent +
                '}';
    }
}
