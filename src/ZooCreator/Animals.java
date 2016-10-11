package ZooCreator;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by rodneytressler on 10/11/16.
 */
public class Animals {
    public static ArrayList<String> list = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public String name;
    public String species;
    public String age;
    public Animals(String n, String s, String a) {
        name = n;
        species = s;
        age = a;
    }
    public static void listAnimals() {
        System.out.println("Animals in the Zoo:" + "\n");
        for (String item : list) {
            System.out.println(item + "\n");
        }
    }

    public static String getName() {
        System.out.println("What is your Animal's name?");
        String name1 = scanner.nextLine();
        return name1;
    }

    public static String getSpecies() {
        System.out.println("What is your Animal's species?");
        String species1 = scanner.nextLine();
        return species1;
    }

    public static String getAge() {
        System.out.println("What is your Animal's age?");
        String age1 = scanner.nextLine();
        return age1;
    }

    public String displayInfo() {
        return "Name: " + name + "\n" +
                "Species: " + species + "\n" +
                "Age: " + age;
    }

    public static void addAnimals() {
        Animals a1 = new Animals(getName(), getSpecies(), getAge());
        list.add(a1.displayInfo());
    }
}
