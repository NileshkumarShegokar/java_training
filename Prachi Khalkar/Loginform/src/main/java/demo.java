
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

@SuppressWarnings("serial")
public class demo extends JFrame {

    private JPanel panel = new JPanel();

    public demo() {

        FormLayout layout = new FormLayout(
                "pref, pref, pref, pref",
                "pref, pref, pref, pref");

        panel.setLayout(layout);
        CellConstraints cc = new CellConstraints();

        panel = new JPanel (layout);

        panel.add(new JLabel("L1 "), cc.xy(2, 2));
        panel.add(new JTextField(15), cc.xy(3, 2));

        panel.add(new JLabel("L2 "), cc.xy(2, 3));
        panel.add(new JTextField(15), cc.xy(3, 3));
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setAlignmentY(Component.CENTER_ALIGNMENT);
        add(panel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setSize(510,400);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new demo().setVisible(true);

            }
        });
    }
}
