import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginPage extends JFrame {
    private JTextField textField1;
    private JPanel panel1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JButton exitButton;
    private JPanel panel1Inside;
    private JLabel username;
    private JLabel password;
    private JLabel TitleName;
    private JFrame frame;
    public LoginPage()
    {
        frame=new JFrame();
        frame.setTitle("LOGIN PAGE");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(250,200));
        frame.setResizable(false);

        frame.add(panel1);

        loginButton.setForeground(Color.RED);
        exitButton.setForeground((Color.RED));

        frame.pack();

        frame.setVisible(true);

        loginButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                loginButtonOperation();

            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                exitButtonOperation();
            }
        });
        loginButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                System.out.println(e.getKeyChar());

                    loginButtonOperation();

            }
        });
        exitButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int a=JOptionPane.showConfirmDialog(panel1,"Are you sure ?","Alert",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
                if(a==JOptionPane.YES_OPTION)
                {
                    System.exit(0);
                }
            }
        });
    }


    public void loginButtonOperation()
    {
        String uservalue=textField1.getText();
        String passvalue=new String(passwordField1.getPassword());
        if(uservalue.equals("Somanshu") && passvalue.equals("Xlozen11"))
        {
            NewPage1 newPage1=new NewPage1();
            newPage1.setPreferredSize(new Dimension(400,400));
            newPage1.setResizable(true);
            newPage1.setVisible(true);
            JLabel wel_msg=new JLabel("Welcome: "+uservalue);
            newPage1.getContentPane().add(wel_msg);
        }
        else
        {
            JOptionPane.showMessageDialog(panel1,"Enter Valid username and password","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }
    public void exitButtonOperation()
    {
        int a=JOptionPane.showConfirmDialog(panel1,"Are you sure ?","Alert",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
        if(a==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
