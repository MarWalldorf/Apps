public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    public Dog(String name, int brain, int size, int weight, int eyes, int legs, int tail) {
        super(name, brain, size, weight);

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
    }

public void chew() {
        System.out.println("Dog.chew() is called");
}

    @Override
    public void eat() {
        super.eat();
        chew();
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }
}
