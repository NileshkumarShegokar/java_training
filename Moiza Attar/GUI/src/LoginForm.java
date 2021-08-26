import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class LoginFrame extends JFrame implements ActionListener {
    JLabel userLabel, passwordLabel, loginPage;
    JButton loginButton, resetButton, cancelButton;
    JTextField userTextField;
    JPasswordField passwordField;
    JCheckBox showPassword;

    public LoginFrame() {

        JFrame frame = new JFrame("Frame");

        frame.setTitle("Login Form");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        loginPage = new JLabel("LOGIN FORM");
        userLabel = new JLabel("USERNAME");
        passwordLabel = new JLabel("PASSWORD");
        userTextField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("LOGIN");
        resetButton = new JButton("RESET");
        cancelButton = new JButton("CANCEL");
        showPassword = new JCheckBox("Show Password");

        loginPage.setBounds(180, 50, 100, 30);
        userLabel.setBounds(50, 100, 100, 30);
        passwordLabel.setBounds(50, 150, 100, 30);
        userTextField.setBounds(150, 100, 150, 30);
        passwordField.setBounds(150, 150, 150, 30);
        showPassword.setBounds(150, 190, 150, 30);
        loginButton.setBounds(50, 250, 100, 30);
        resetButton.setBounds(160, 250, 100, 30);
        cancelButton.setBounds(270, 250, 100, 30);

        frame.add(loginPage);
        frame.add(userLabel);
        frame.add(passwordLabel);
        frame.add(userTextField);
        frame.add(passwordField);
        frame.add(showPassword);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(cancelButton);

        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        cancelButton.addActionListener(this);
        showPassword.addActionListener(this);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = new String(passwordField.getPassword());
            if (userText.equalsIgnoreCase("moiza") && pwdText.equalsIgnoreCase("12345")) {
                JOptionPane.showMessageDialog(this, "Login Successful");

                UI page = new UI();
                //page.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }

        }
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }

        //Coding Part of CANCEL button
        if (e.getSource() == cancelButton){
            int result = JOptionPane.showConfirmDialog(this,"DO you want to exit?", "Swing Tester",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }
            else
            {

            }
        }
        //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
    }

}

public class LoginForm {
    public static void main(String[] args) {
        LoginFrame lf = new LoginFrame();
    }
}
