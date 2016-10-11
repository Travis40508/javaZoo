package ZooCreator;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by rodneytressler on 10/11/16.
 */
public class People {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> list = new ArrayList<>();
    String name;
    String age;
    public People(String n, String a) {
        name = n;
        age = a;
    }
    public static void listPeople() {
        System.out.println("People in the Zoo:" + "\n");
        for (String item : list) {
            System.out.println(item + "\n");
        }
    }

    public static String getName() {
        System.out.println("What is the Person's Name?");
        String name1 = scanner.nextLine();
        return name1;
    }
    public static String getAge() {
        System.out.println("What is the person's Age?");
        String age1 = scanner.nextLine();
        return age1;
    }

    public String displayInfo() {
        return "Name: " + name + "\n" +
                "Age: " + age;
    }

    public static void addPeople() {
        People p1 = new People(getName(), getAge());
        list.add(p1.displayInfo());
    }
}
