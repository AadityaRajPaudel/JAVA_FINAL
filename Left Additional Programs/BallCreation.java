// create a ball wherever user clicks
import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;

public class BallCreation extends JFrame implements MouseListener{
    int x = -50, y = -50; // initially to not display the ball
    public BallCreation() {
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
    }
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, 40, 40);
    }
    public static void main(String [] args) {
        new BallCreation();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX(); y = e.getY();
        repaint();
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
