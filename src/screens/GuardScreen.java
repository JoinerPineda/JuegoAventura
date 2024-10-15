package screens;

import javax.swing.*;

public class GuardScreen extends JFrame {
    public GuardScreen () {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
    }

    private JButton guardBtn;
    private JPanel panel;

    public void setGuardBtnImage (String filename) {
        guardBtn.setIcon(new ImageIcon(filename));
    }
}
