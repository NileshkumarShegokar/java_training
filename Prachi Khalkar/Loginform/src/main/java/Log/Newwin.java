package Log;

import javax.swing.*;

public class Newwin extends JFrame {

    JFrame f;
    JMenuBar mb;
    JMenu file,edit,help;
    JMenuItem cut,copy,paste,selectAll,ne,open,save,ex,he,about;
    Newwin()
    {
        f=new JFrame("Notepad");

        ne=new JMenuItem("New");
        open=new JMenuItem("Open");
        save=new JMenuItem("Save");
        ex=new JMenuItem("Exit");
        cut=new JMenuItem("cut");
        copy=new JMenuItem("copy");
        paste=new JMenuItem("paste");
        selectAll=new JMenuItem("selectAll");
        he=new JMenuItem("Help");
        about=new JMenuItem("About");

        mb=new JMenuBar();
        mb.setBounds(5,5,400,40);

        file=new JMenu("File");
        edit=new JMenu("Edit");
        help=new JMenu("Help");

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        file.add(ne);
        file.add(open);
        file.add(save);
        file.add(ex);

        help.add(he);
        help.add(about);

        mb.add(file);
        mb.add(edit);
        mb.add(help);

        f.add(mb);

        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);


    }

    public static void main(String[] args) {
        new Newwin();
    }
}
