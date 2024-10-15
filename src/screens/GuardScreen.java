package screens;

import backend.riddles.Riddle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuardScreen extends JFrame {

    private HomeScreen homeScreen;
    public GuardScreen () {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        guardBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Riddle riddle = homeScreen.getRiddle();
                if (riddle == null) {
                    JOptionPane.showMessageDialog(null, "No tienes más acertijos");
                    return;
                };

                String response = JOptionPane.showInputDialog(riddle.getDescription());
                if (response == null) return;

                boolean isCorrect = homeScreen.solve(response);
                String msg = isCorrect ? "Acertaste" : "Fallaste";
                JOptionPane.showMessageDialog(null, msg);

                if (isCorrect && homeScreen.hasOver()) {
                    JOptionPane.showMessageDialog(null, "Has terminado");
                    homeScreen.backHome();
                }
            }
        });
        historyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String history = homeScreen.getEvents();
                JOptionPane.showMessageDialog(null, history);
            }
        });
    }

    private JButton guardBtn;
    private JPanel panel;
    private JButton historyBtn;

    public void setGuardBtnImage (String filename) {
        guardBtn.setIcon(new ImageIcon(filename));
    }

    public HomeScreen getHomeScreen() {
        return homeScreen;
    }

    public void setHomeScreen(HomeScreen homeScreen) {
        this.homeScreen = homeScreen;
    }
}
