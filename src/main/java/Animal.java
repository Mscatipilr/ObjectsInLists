
public class Animal {
    private String name;
    private boolean isDog;

    //constructor
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }
    public String getName() {
        return name;
    }
    public boolean isDog() {
        return isDog;
    }
    @Override
    public String toString() {
        return "Animal name: " + name + ", is a dog = " + isDog;
    }
}
