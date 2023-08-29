// All in one mouse listener problems


import java.awt.event.*;
import javax.swing.* ;

public class SwingTwo implements MouseListener, MouseMotionListener{
    JFrame f ;
    JTextField t1, t2 ;
    public SwingTwo() {
        f = new JFrame("Frame");
        f.setSize(600, 600);
        t1 = new JTextField();
        t1.setBounds(100, 100, 100, 50);
        t2 = new JTextField();
        t2.setBounds(100, 200, 100, 50);
        t1.setEditable(false);
        t2.setEditable(false);

        f.add(t1); 
        f.add(t2);
        f.setLayout(null) ;
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.addMouseListener(this);
        f.addMouseMotionListener(this);
    }
    public static void main(String [] args) {
        new SwingTwo();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
       
    }
    @Override
    public void mouseReleased(MouseEvent e) {
      
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        t1.setText("Entered");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        t1.setText("Exited");
    }
    @Override
    public void mouseDragged(MouseEvent e) {
       
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        String s = "X = "+e.getX()+" Y = "+e.getY();
        t2.setText(""+s);
    }
}
