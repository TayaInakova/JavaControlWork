package toyStore.models;

public abstract class Toy {
    /**
     * В принципе игрушка
     */
    private String name;
    private int id;
    private int weight;
    private int percent;

    public Toy(String name, int id, int weight, int percent) {
        this.name = name;
        this.id = id;
        this.weight = weight;
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", weight=" + weight +
                ", percent=" + percent +
                '}';
    }
}
