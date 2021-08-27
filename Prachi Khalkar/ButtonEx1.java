import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ButtonEx1 {



        private JFrame mf;
        private JLabel hl;
        private JLabel stlb;
        private JPanel cp;

        public ButtonEx1(){
            prepareGUI();
        }
        public static void main(String[] args){
            ButtonEx1  b1 = new ButtonEx1();
            b1.showActionListenerDemo();
        }
        private void prepareGUI(){
            mf = new JFrame("Java SWING Examples");
            mf.setSize(400,400);
            mf.setLayout(new GridLayout(3, 1));

            hl= new JLabel("",JLabel.CENTER );
            stlb = new JLabel("",JLabel.CENTER);
            stlb.setSize(350,100);

            mf.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent){
                    System.exit(0);
                }
            });
            cp = new JPanel();
            cp.setLayout(new FlowLayout());

            mf.add(hl);
            mf.add(cp);
            mf.add(stlb);
            mf.setVisible(true);
        }
        private void showActionListenerDemo(){
            hl.setText("Listener in action: ActionListener");

            JPanel panel = new JPanel();
            panel.setBackground(Color.PINK);
            JButton okButton = new JButton("OK");

            okButton.addActionListener(new CustomActionListener());
            panel.add(okButton);
            cp.add(panel);
            mf.setVisible(true);
        }
        class CustomActionListener implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                stlb.setText("Ok Button Clicked.");
            }
        }
    }



