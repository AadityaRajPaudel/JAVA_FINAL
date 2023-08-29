// Pop-up menu -> easyyy clapp

import java.awt.event.*;
import javax.swing.* ;

public class MenuThree implements ActionListener, MouseListener{
    JFrame f ;
    JTextField t;
    JPopupMenu menu ;
    JMenuItem one, two ;
    public MenuThree() {
        f = new JFrame("Pop-Up Menu");
        f.setSize(600, 600);
        t = new JTextField();
        t.setBounds(100, 100, 100, 50);

        menu = new JPopupMenu();
        f.add(menu);
        one = new JMenuItem("One");
        menu.add(one);
        two = new JMenuItem("Two");
        menu.add(two);
        f.add(t);
        t.setEditable(false);

        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.addMouseListener(this); // may be null too lets see
        one.addActionListener(this);
        two.addActionListener(this);
    }    
    public static void main (String [] args) throws Exception{
        new MenuThree();
    }
    public void actionPerformed (ActionEvent e) {
        t.setText(e.getActionCommand()+" is selected");
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        menu.show(f.getContentPane(), e.getX(), e.getY());
    }
    @Override
    public void mousePressed(MouseEvent e) {
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
