package backend;

import screens.DoorScreen;
import screens.GuardScreen;
import screens.HomeScreen;

public class Main {
    public static void main(String[] args) {
        HomeScreen homeScreen = new HomeScreen();
        DoorScreen doorScreen = new DoorScreen();
        GuardScreen guardScreen = new GuardScreen();

        homeScreen.setDoorScreen(doorScreen);
        homeScreen.setGuardScreen(guardScreen);

        homeScreen.setSize(1300,500);
        homeScreen.setLocationRelativeTo(null);

        doorScreen.setSize(1300,500);
        doorScreen.setLocationRelativeTo(null);

        guardScreen.setSize(1300,500);
        guardScreen.setLocationRelativeTo(null);

        homeScreen.setVisible(true);
    }
}
