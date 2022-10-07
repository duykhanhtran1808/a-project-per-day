package day01;

public class ZooGame {
    public static void main(String[] args) {
        UserController uControl = new UserController();
        ZooManager zooNum1 = new ZooManager();

        uControl.printSomething("Welcome to the zoo, bro! This is your first zoo");
        uControl.printSomething("Just give it a name, bro");

        zooNum1.setName(uControl.getUserInput("Enter the name:"));
        uControl.printSomething(zooNum1.getName() + " sounds like a good zoo name!");
        zooNum1.setSize(10);
        uControl.printSomething("The current level of the zoo is: " + zooNum1.getLevel());

        boolean gamePlay = true;
        uControl.printSomething("Menu:");
        uControl.printSomething("1. Open tour to get more experience: tour");
        uControl.printSomething("2. Check the level of the zoo: lvl");
        uControl.printSomething("3. Quit the game: bye");

        String userCmd;
        while(gamePlay) {
            userCmd = uControl.getUserInput("\nEnter a command, bro!");
            if(userCmd.equals("tour")) {
                uControl.printSomething("A boring tour happened, thanks!");
                zooNum1.openTour();
            } else if(userCmd.equals("lvl")) {
                uControl.printSomething("The current level of the zoo is: " + zooNum1.getLevel());
            } else if(userCmd.equals("bye")) {
                gamePlay = false;
            } else {
                uControl.printSomething("We don't speak that language, mate!");
            }
        }
        uControl.printSomething("See you soon");
        uControl.printSomething("Summary");
        uControl.printSomething("Zoo Name: " + zooNum1.getName());
        uControl.printSomething("Zoo Exp: " + zooNum1.getExp());
        uControl.printSomething("Zoo Level: " + zooNum1.getLevel());

        uControl.endInput();
    }
}