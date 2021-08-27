package LoginForm;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends Component implements ActionListener {
    JLabel title,l1,l2;
    JTextField  tf1;
    JPasswordField tf2;
    JButton b1,b2;
    Login()
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(
                new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JPanel a = new JPanel();
        a.setAlignmentX(Component.CENTER_ALIGNMENT);
        a.setPreferredSize(new Dimension(500, 500));
        a.setMaximumSize(new Dimension(500, 500)); // set max = pref
        a.setBorder(BorderFactory.createTitledBorder("aa"));
        a.setBackground(Color.BLACK);

        frame.getContentPane().add(a);

        title= new JLabel("Login Form");
        title.setForeground(Color.CYAN);
        title.setFont(new Font("Serif", Font.BOLD, 20));

        l1=new JLabel("Enter Username :");
        l2=new JLabel("Enter PassWord :");
        tf1=new JTextField(10);
        tf2=new JPasswordField(10);
        b1=new JButton("Login");
        b2=new JButton("Cancel");

        title.setBounds(100, 30, 400, 30);
        l1.setBounds(60, 90, 400, 30);
        l2.setBounds(60, 130, 400, 30);
        tf1.setBounds(180, 90, 150, 30);
        tf2.setBounds(180, 130, 150, 30);
        b1.setBounds(100, 180, 80, 30);
        b2.setBounds(200, 180, 80, 30);

       a.add(title);

        a.add(l1);
        a.add(l2);
        a.add(tf1);

        a.add(tf2);

        b1.addActionListener(this);
        a.add(b1);
        b1.setBackground(Color.GRAY);
        b2.addActionListener(this);
        a.add(b2);
        b2.setBackground(Color.GRAY);



        frame.pack();
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
    public static void main(String[] args) {
        new Login();
    }


}

