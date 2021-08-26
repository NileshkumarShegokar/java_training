
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;


    class LoginPage extends JFrame implements ActionListener
    {
        //initialize button, panel, label, and text field
        JButton b1,b2;
        JPanel newPanel;
        JLabel userLabel, passLabel;
        final JTextField  textField1, textField2;

        //calling constructor
        LoginPage()
        {

            //create label for username
            userLabel = new JLabel();
            userLabel.setText("Username");      //set label value for textField1

            //create text field to get username from the user
            textField1 = new JTextField(15);    //set length of the text

            //create label for password
            passLabel = new JLabel();
            passLabel.setText("Password");      //set label value for textField2

            //create text field to get password from the user
            textField2 = new JPasswordField(15);    //set length for the password

            //create submit button
            b1 = new JButton("Login"); //set label to button login
            b2 = new JButton("Exit"); // set label to button exit
            //create panel to put form elements
            newPanel = new JPanel(new GridLayout(3, 1));
            newPanel.add(userLabel);    //set username label to panel
            newPanel.add(textField1);   //set text field to panel
            newPanel.add(passLabel);    //set password label to panel
            newPanel.add(textField2);   //set text field to panel
            newPanel.add(b1);           //set login button
            newPanel.add(b2);           //set exit button
            //set border to panel
            add(newPanel, BorderLayout.CENTER);

            //perform action on button click
            b1.addActionListener(this);   //add action listener to button
            setTitle("LOGIN FORM");         //set title to the login form
            b2.addActionListener(this);
        }

        //define abstract method actionPerformed() which will be called on button click
        public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter
        {
            if(ae.getSource()==b1)
            {
                String userValue = textField1.getText();        //get user entered username from the textField1
                String passValue = textField2.getText();        //get user entered pasword from the textField2

                //check whether the credentials are authentic or not
                if (userValue.equals("Somanshu") && passValue.equals("Xlozen11")) {  //if authentic, navigate user to a new page

                    //create instance of the NewPage
                    NewWindow page = new NewWindow();

                    //make page visible to the user
                    page.setVisible(true);

                    //create a welcome label and set it to the new page
                    JOptionPane.showMessageDialog(newPanel,"Welcome to Menu Demo");
                    JLabel wel_label = new JLabel("Welcome: " + userValue);
                    page.getContentPane().add(wel_label);
                } else {
                    //show error message
                    System.out.println("Please enter valid username and password");

                    JOptionPane.showMessageDialog(newPanel, "Please enter valid username and password");
                }
            }
            else if(ae.getSource()==b2)
            {
                int a=JOptionPane.showConfirmDialog(newPanel,"Are you sure ?");
                if(a==JOptionPane.YES_OPTION)
                {
                    System.exit(0);
                }
            }
        }
    }
    //create the main class
    class LoginFormDemo
    {
        //main() method start
        public static void main(String arg[])
        {
            try
            {
                //create instance of the CreateLoginForm
                LoginPage form = new LoginPage();
                form.setSize(300,100);  //set size of the frame
                form.setVisible(true);  //make form visible to the user
            }
            catch(Exception e)
            {
                //handle exception
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

