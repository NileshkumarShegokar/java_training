import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

import java.awt.event.*;

public class LoginExample extends JFrame {

    public static void main(String[] args) {



        LoginExample frame = new LoginExample();

        frame.getContentPane().setBackground(Color.BLUE);


    }



    JButton button = new JButton("Submit");
    JButton button1 = new JButton("Cancel");

    JPanel panel = new JPanel();
    JTextField textField = new JTextField(15);
    JPasswordField jPasswordField = new JPasswordField(15);
    JLabel label = new JLabel();
    JLabel label2 = new JLabel();
    LoginExample() {


        label.setText("Username:");
        label2.setText("Password:");

        setSize(300, 200);
        setLocation(500, 280);
        panel.setLayout(null);



        label.setBounds(10, 30, 130, 20);
        label2.setBounds(10,65,  130,  20);
        textField.setBounds(80, 30, 170, 20);
        jPasswordField.setBounds(80, 65, 170, 20);
        button.setBounds(70, 100, 80, 20);
        button1.setBounds(160, 100, 95, 20);


        panel.add(label);
        panel.add(label2);
        panel.add(button);
        panel.add(button1);

        panel.add(textField);
        panel.add(jPasswordField);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        actionlogin();

    }

    public void actionlogin() {
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String name = textField.getText();
                String pwd = jPasswordField.getText();
                if (name.equals("Aress") && pwd.equals("1234")) {
                    newframe regFace = new newframe();
                    regFace.setVisible(true);
                    dispose();
                } else {

                    JOptionPane.showMessageDialog(null,"Wrong Password / Username");
                    textField.setText("");
                    jPasswordField.setText("");
                    textField.requestFocus();
                }

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });


    }



}