package screens;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DoorScreen extends JFrame {
    private HomeScreen homeScreen;
    public DoorScreen () {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        door1Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeScreen.goToGuardScreen(1);
            }
        });
        door2Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeScreen.goToGuardScreen(2);
            }
        });
    }


    public HomeScreen getHomeScreen() {
        return homeScreen;
    }

    public void setHomeScreen(HomeScreen homeScreen) {
        this.homeScreen = homeScreen;
    }

    private JButton door1Btn;
    private JButton door2Btn;
    private JPanel panel;
    private JTextArea deberásElegirEntreDosTextArea;

}
