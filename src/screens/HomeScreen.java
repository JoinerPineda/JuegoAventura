package screens;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends JFrame {

    private DoorScreen doorScreen;
    private GuardScreen guardScreen;

    public HomeScreen () {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        playBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                doorScreen.setVisible(true);
            }
        });
    }
    private JButton playBtn;
    private JTextArea enEsteEmocionanteJuegoTextArea;
    private JPanel panel;

    public JFrame getDoorScreen() {
        return doorScreen;
    }

    public void setDoorScreen(DoorScreen doorScreen) {
        this.doorScreen = doorScreen;
        this.doorScreen.setHomeScreen(this);
    }

    public JFrame getGuardScreen() {
        return guardScreen;
    }

    public void setGuardScreen(GuardScreen guardScreen) {
        this.guardScreen = guardScreen;
    }

    public void goToGuardScreen (int fromDoor) {
        doorScreen.setVisible(false);

        if (fromDoor == 1) {
            guardScreen.setGuardBtnImage("src/screens/guardia1.png");
        }
        else if (fromDoor == 2) {
            guardScreen.setGuardBtnImage("src/screens/guardia2.png");
        }

        guardScreen.setVisible(true);
    }
}
