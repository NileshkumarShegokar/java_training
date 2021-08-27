package LoginForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class LoginDemo extends JFrame implements ActionListener
{
    JLabel title,l1,l2;
    JTextField  tf1;
    JPasswordField tf2;
    JButton b1,b2;
    LoginDemo()
    {
        JFrame frame = new JFrame();
        frame.setSize(400, 300);

        frame.setLayout(null);
        frame.setTitle("login Form");

        frame.setLocationRelativeTo(null);

        title= new JLabel("Login Form");
        title.setForeground(Color.blue);
        title.setFont(new Font("Serif", Font.BOLD, 20));

        l1=new JLabel("Enter Username :");
        l2=new JLabel("Enter PassWord :");
        tf1=new JTextField();
        tf2=new JPasswordField();
        b1=new JButton("Login");
        b2=new JButton("Cancel");

        title.setBounds(130, 30, 400, 30);
        l1.setBounds(60, 90, 400, 30);
        l2.setBounds(60, 130, 400, 30);
        tf1.setBounds(180, 90, 150, 30);
        tf2.setBounds(180, 130, 150, 30);
        b1.setBounds(100, 180, 80, 30);
        b2.setBounds(200, 180, 80, 30);

        frame.add(title);

        frame.add(l1);
        frame.add(l2);
        frame.add(tf1);

        frame.add(tf2);

        b1.addActionListener(this);
        frame.add(b1);
        b2.addActionListener(this);
        frame.add(b2);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            String uname = tf1.getText();
            String pass = new String(tf2.getPassword());
            if(uname.equals("gayatri@gmail.com") && pass.equals("Gayatri@123"))
            {
                JOptionPane.showMessageDialog(this,"Submited Successfully");
                Notepad n=new Notepad();

            }
            else
            {
                JOptionPane.showMessageDialog(this,"Incorrect login or password",
                        "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (e.getSource()==b2)
        {
            int result = JOptionPane.showConfirmDialog(this,"Sure? You want to exit?", "Swing Tester",
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
    }


    public static void main(String[] args)
    {
        LoginDemo L=new LoginDemo();


    }


}




