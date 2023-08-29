// simple menu, non functional
import javax.swing.* ;

public class MenuOne {
    JFrame f ;
    JMenuBar bar ;
    JMenu file, edit, n ;
    JMenuItem save, exit, pdf ;
    public MenuOne() {
        
        f = new JFrame("Menu");
        f.setSize(600, 600);
        bar = new JMenuBar() ;
        f.setJMenuBar(bar); // imp

        file = new JMenu("File");
        bar.add(file);
        edit = new JMenu("Edit");
        bar.add(edit);
        n = new JMenu("New");
        file.add(n);
        save = new JMenuItem("Save");
        file.add(save);
        file.addSeparator();
        exit = new JMenuItem("Exit");
        file.add(exit);
        pdf = new JMenuItem("PDF");
        n.add(pdf);

        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String [] args) {
        new MenuOne();
    }
}
