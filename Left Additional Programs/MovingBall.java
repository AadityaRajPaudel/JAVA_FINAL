// put 4 buttons, up down left and write, whichever button we click, the ball should move in that direction
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MovingBall extends JFrame implements ActionListener{
    int x = 300, y= 300;
    JButton left, right, top, down ;
    public MovingBall() {
        setSize(600, 600);
        left = new JButton("Left");
        right = new JButton("Right");
        top = new JButton("Top");
        down = new JButton("Down");
        
        add(left);
        add(right);
        add(top);
        add(down);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        left.addActionListener(this);
        right.addActionListener(this);
        top.addActionListener(this);
        down.addActionListener(this);
    }
    public void paint(Graphics g) {
        super.paint(g); // imp
        g.setColor(Color.RED);
        g.fillOval(x, y, 20, 20);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()==left) {
        x = x - 10 ;
       }
       else if (e.getSource()==right) x+=10;
       else if(e.getSource()==top) y-=10;
       else y+=10;
       repaint();
    }
    public static void main (String [] args) {
        new MovingBall();
    }
}
