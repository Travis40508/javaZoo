package ZooCreator;
import java.util.Scanner;
/**
 * Created by rodneytressler on 10/11/16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
        System.out.println("Welcome To Zoo Creator 6.0 Please Choose An Option:" + "\n" +
                "1. List All Animals In Zoo" + "\n" +
                "2. Add Animals to Animal List" + "\n" +
                "3. List All People in Zoo" + "\n" +
                "4. Add People to People List" + "\n" +
                "5. Help" + "\n" +
                "6. Quit");
        int response = scanner.nextInt();
        switch(response) {
            case(1) :
                Animals.listAnimals();
                break;
            case(2) :
                Animals.animalPicker();
                break;
            case(3) :
                People.listPeople();
                break;
            case(4) :
                People.peoplePicker();
                break;
            case(5) :
                Zoo.help();
                break;
        }
        if(response == 6) {
            break;
        }
        }
    }


}
