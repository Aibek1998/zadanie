import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cat cat = new Cat("Tom", 2, "blue", 10, "shortair");
        Dog dog = new Dog("Rex", 4, "black", 18, "shepherd");
        Cow cow = new Cow("Marta", 5, "yellow", 120, "the Danish breed");
        Duck duck = new Duck("Donald", 7, "white", 8, "Peking Duck");
        String animals = sc.nextLine();
        switch (animals.toLowerCase(Locale.ROOT)) {
            case ("cat"):
                System.out.println("Name : " + cat.name + "\n" +
                        "Age : " + cat.age + "\n" +
                        "Color : " + cat.color + "\n" +
                        "weight : " + cat.weight + "\n" +
                        "breed : " + cat.breed);
                break;
            case ("dog"):
                System.out.println("Name : " + dog.name + "\n" +
                        "Age : " + dog.age + "\n" +
                        "Color : " + dog.color + "\n" +
                        "weight : " + dog.weight + "\n" +
                        "breed : " + dog.breed);
                break;
            case ("cow"):
                System.out.println("Name : " + cow.name + "\n" +
                        "Age : " + cow.age + "\n" +
                        "Color : " + cow.color+"\n" +
                        "weight : " + cow.weight + "\n" +
                        "breed : " + cow.breed);
                break;
            case ("duck"):
                System.out.println("Name : " + duck.name + "\n" +
                        "Age : " + duck.age + "\n" +
                        "Color : " + duck.color + "\n" +
                        "weight : " + duck.weight + "\n" +
                        "breed : " + duck.breed);
                break;
            default:
                System.out.println("Error");
        }
    }
}