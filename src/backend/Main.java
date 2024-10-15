package backend;

import backend.riddles.RiddleRepository;
import screens.DoorScreen;
import screens.GuardScreen;
import screens.HomeScreen;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        HomeScreen homeScreen = new HomeScreen();
        DoorScreen doorScreen = new DoorScreen();
        GuardScreen guardScreen = new GuardScreen();
        RiddleRepository repository = new RiddleRepository();
        AdventureGame game = new AdventureGame(0, repository.getRiddles(), new LinkedList<>());

        homeScreen.setDoorScreen(doorScreen);
        homeScreen.setGuardScreen(guardScreen);
        homeScreen.setGame(game);

        homeScreen.setSize(1300,500);
        homeScreen.setLocationRelativeTo(null);

        doorScreen.setSize(1300,500);
        doorScreen.setLocationRelativeTo(null);

        guardScreen.setSize(1300,500);
        guardScreen.setLocationRelativeTo(null);

        homeScreen.setVisible(true);
    }
}
