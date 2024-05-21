public class Animal {
    private String Name;
    private int brain;
    private int size;
    private int weight;

    public Animal(String name, int brain, int size, int weight) {
        Name = name;
        this.brain = brain;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {

    }

    public void move() {

    }

    public String getName() {
        return Name;
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
