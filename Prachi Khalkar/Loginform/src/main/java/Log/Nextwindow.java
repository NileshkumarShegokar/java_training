package Log;

import javax.swing.*;

public class Nextwindow extends JFrame {

    public static void main(String[] args) {
        Nextwindow frameTabel = new Nextwindow();
    }

    JLabel welcome = new JLabel("Welcome to a New Frame");
    JPanel panel = new JPanel();

    Nextwindow() {
        super("Welcome");
        setSize(300, 200);
        setLocation(500, 280);
        panel.setLayout(null);

        welcome.setBounds(70, 50, 150, 60);

        panel.add(welcome);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}