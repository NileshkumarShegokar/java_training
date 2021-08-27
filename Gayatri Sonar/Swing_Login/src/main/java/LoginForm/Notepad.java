package LoginForm;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Notepad extends JFrame
{
    JFrame frame;
    JMenuBar menuBar;
    JMenu file,edit,format,help;
    JMenuItem open, newFile, save, exit,undo, paste, selectAll;
    JFileChooser fileChooser;
    JTextArea textArea;

    Notepad()
    {
        frame = new JFrame("Notepad Application");
        file = new JMenu("File");
        edit = new JMenu("Edit");
        format = new JMenu("Format");
        help = new JMenu("Help");
        newFile = new JMenuItem("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");
        undo = new JMenuItem("Undo       Ctrl+Z");
        paste = new JMenuItem("Paste      Ctrl+V");
        selectAll = new JMenuItem("Select All    Ctrl+A ");
        textArea = new JTextArea();
        fileChooser = new JFileChooser();
        menuBar = new JMenuBar();

        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.add(textArea);
        file.add(open);
        file.add(newFile);
        file.add(save);
        file.add(exit);
        edit.add(undo);
        edit.add(paste);
        edit.add(selectAll);
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(format);
        menuBar.add(help);

        frame.setJMenuBar(menuBar);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        new Notepad();






        
    }


}
