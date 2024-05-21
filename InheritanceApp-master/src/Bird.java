public class Bird extends Animal {
    private int legs;
    private int eyes;
    private int wings;
    public Bird(String name, int brain, int size, int weight, int legs, int eyes, int wings) {
        super(name, brain, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.wings = wings;
    }

    public void Chirp() {
        System.out.println("Bird.chirp() is called");
    }

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    public int getWings() {
        return wings;
    }
}
