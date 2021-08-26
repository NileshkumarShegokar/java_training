package Log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Loginform extends JFrame implements ActionListener {

    JButton b1,b2,b3;
    JPanel panel;
    JLabel userLabel, passLabel,msg,l1;
    JTextField textField1, textField2;
    JFrame f;

    Loginform() {
         f= new JFrame("LOGIN PAGE");
         userLabel = new JLabel("Username");
        userLabel.setFont(new Font("Courier New", Font.ITALIC, 20));
        userLabel.setBackground(Color.PINK);

        textField1 = new JTextField(15);
        //textField1.setForeground(color.red);

        Color c=Color.blue;
        textField1.setForeground(c);

                //textField1.setBackground(Color.lightGray);
        passLabel = new JLabel("Password");
        passLabel.setFont(new Font("Courier New", Font.ITALIC, 20));
        passLabel.setBackground(Color.PINK);
        textField2 = new JPasswordField(15);
        Color c1=Color.BLUE;
        textField1.setForeground(c1);
       // textField2.setBackground(Color.lightGray);

        b1 = new JButton("Login");
        b1.setBackground(Color.PINK);
        b1.setFont(new Font("Courier New", Font.ITALIC, 18));
        b2= new JButton("Cancle");
        b2.setBackground(Color.PINK);
        b2.setFont(new Font("Courier New", Font.ITALIC, 18));
        b3= new JButton("Reset");
        b3.setBackground(Color.PINK);
        b3.setFont(new Font("Courier New", Font.ITALIC, 18));


      /* panel = new JPanel(new GridLayout(3, 2));
        panel.add(userLabel);
        panel.add(textField1);
        panel.add(passLabel);
        panel.add(textField2);
        panel.add(b1);
        panel.add(b2);
          panel.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
         b3.addActionListener(this);

        setTitle("LOGIN PAGE");
        setLocation(new Point(500, 300));
        add(panel);
        setSize(new Dimension(400, 200));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel, BorderLayout.CENTER);
        setVisible(true);*/
        l1 = new JLabel("Login Form :");

        l1.setForeground(Color.blue);

        l1.setFont(new Font("Serif", Font.BOLD, 30));

        l1.setBounds(80, 40, 400, 30);

        userLabel.setBounds(80, 80, 200, 30);
        passLabel.setBounds(80, 120, 200, 30);
        textField1.setBounds(300, 80, 200, 30);
        textField2.setBounds(300, 120, 200, 30);
        b1.setBounds(150, 160, 100, 30);
        b2.setBounds(300, 160, 100, 30);
        b3.setBounds(450, 160, 100, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        f.add(l1);
        f.add( userLabel);
        f.add(textField1);
        f.add(passLabel);
        f.add( textField2);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setSize(400, 400);
        f.setLayout(null);
        //f.setLocationRelativeTo(null);
        f.setVisible(true);


    }

    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource()==b1) {
            String userValue = textField1.getText();
            String passValue = textField2.getText();


            if (userValue.equals("Prachi") && passValue.equals("Khalkar")) {

                Newwin n =new Newwin();
              // n.setVisible(true);
                /*JOptionPane.showMessageDialog(f,
                        "login Successful");*/

            } else {

                JOptionPane.showMessageDialog(f, "Please enter the correct userid and Password",
                        "Swing Tester", JOptionPane.ERROR_MESSAGE);
            }

        }


        else if(ae.getSource()==b2)
        {
            int res= JOptionPane.showConfirmDialog(null,
                    "Do you want to Exit?", "Select an Option...",JOptionPane.YES_NO_OPTION);

            if(res == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }
            else if(res == JOptionPane.NO_OPTION)
            {
                setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }

        }

        else if(ae.getSource()==b3)
        {
            textField1.setText("");
            textField2.setText("");
        }


}
}

public class Login {
    public static void main(String arg[])
    {
        /*try
        {

            Loginform form = new Loginform();
            form.setSize(300,100);
            form.setVisible(true);
        }
        catch(Exception e)
        {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }*/
        Loginform form = new Loginform();

    }
}

