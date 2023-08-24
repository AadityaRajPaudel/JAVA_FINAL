// draw circle and add button, color of circle changes everytime button is clicked
import java.awt.* ;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class CircleDraw extends JFrame implements ActionListener{
    float red, green, blue ;
    JButton b1 ;
    public CircleDraw() {
        setSize(600, 600);
        b1= new JButton("Click");
        b1.setBounds(100, 50, 60, 40);
        add(b1);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(this);        
    }
    public void paint (Graphics g) {
        Random r = new Random();
        red = r.nextFloat();
        green = r.nextFloat();
        blue = r.nextFloat();
        Color c = new Color(red, green, blue);
        g.setColor(c);
        g.fillOval(300, 300, 40, 40);
    }
    public void actionPerformed(ActionEvent e) {
        repaint();

    }
    public static void main (String [] args) {
        new CircleDraw();
    }
}