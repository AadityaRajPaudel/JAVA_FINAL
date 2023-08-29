// functional menu bar
import java.awt.event.* ;
import java.awt.event.ActionListener;

import javax.swing.* ;

public class MenuTwo implements ActionListener{
    JFrame f ;
    JTextField t ;
    JMenuBar bar ;
    JMenu menu ;
    JMenuItem selectAll, cut, copy, paste, ex ;
    public MenuTwo() {
        f = new JFrame("Frame");
        f.setSize(600, 600);
        t = new JTextField();
        t.setBounds(100, 100, 100, 50);

        bar = new JMenuBar();
        f.setJMenuBar(bar);
        menu = new JMenu("Menu");
        bar.add(menu);
        
        selectAll = new JMenuItem("Select All");
        menu.add(selectAll);
        cut = new JMenuItem("Cut");
        menu.add(cut);
        copy = new JMenuItem("Copy");
        menu.add(copy);
        paste = new JMenuItem("Paste");
        menu.add(paste);
        ex = new JMenuItem("Exit");
        menu.add(ex);

        f.add(t);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        selectAll.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        ex.addActionListener(this);
    }
    public static void main (String [] args) {
        new MenuTwo();
    }
    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == selectAll) {
            t.selectAll();
        }
        else if (e.getSource() == cut) {
            t.cut();
        }
        else if (e.getSource() == copy) {
            t.copy();
        }
        else if (e.getSource() == paste) {
            t.paste();
        }
        else {
            System.exit(0);
        }
    }
}
