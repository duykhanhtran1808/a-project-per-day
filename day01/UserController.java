package day01;
import java.util.Scanner;

public class UserController {
    Scanner scannerObj = new Scanner(System.in);
    public String getUserInput(String message) {
        System.out.println(message);
        String userInput = scannerObj.nextLine();
        return userInput;
    }

    public void printSomething(String toPrint){
        System.out.println(toPrint);
    }

    public void endInput() {
        scannerObj.close();
    }
}
