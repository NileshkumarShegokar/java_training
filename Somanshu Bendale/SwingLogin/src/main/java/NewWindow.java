import sun.rmi.runtime.NewThreadAction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class NewWindow extends JFrame
{
    JPanel panel2;
    JMenuBar menuBar;
    JMenu menu;
    public NewWindow()
    {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MenuBar Demo");
        setSize(400, 200);
        panel2=new JPanel(new BorderLayout());

        menuBar=new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu1=new JMenu("Menu 1");
        menuBar.add(menu1);





    }


}
