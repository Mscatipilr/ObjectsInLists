import java.util.ArrayList;
import java.util.Scanner;

public class AnimalList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        ArrayList<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.println("What is your animal's name?");
            String name = in.nextLine();
            if (name.isEmpty()) {
                for (Animal animal : animals) {
                    System.out.println(animal);
                }
                break;
            }
            System.out.println("Is your animal a dog? (true/false)");
            boolean dog = in.nextBoolean();
            in.nextLine();//Consume newline character
            Animal animal = new Animal(name, dog);
            animals.add(animal);
        }

        in.close(); //to avoid resource leak
    }

}
