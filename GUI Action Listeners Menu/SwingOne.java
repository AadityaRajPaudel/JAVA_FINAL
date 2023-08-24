// All in one action listener problems

import javax.swing.* ;
import java.awt.* ;
import java.awt.event.*;

public class SwingOne implements ActionListener{
    JFrame f ;
    JButton b1;
    JTextField t1, t2;
    public SwingOne(){
        f = new JFrame("Frame");
        f.setSize(600, 600);
        b1 = new JButton("Check");
        b1.setBounds(100, 50, 100, 50);
        t1 = new JTextField();
        t1.setBounds(100, 150, 100, 50);
        t2 = new JTextField();
        t2.setBounds(100, 250, 100, 50);
        t2.setEditable(false);

        f.add(b1);
        f.add(t1);
        f.add(t2);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(this);
        
    }
    public static void main (String [] args) {
        new SwingOne();
    }
    public void actionPerformed(ActionEvent e) {
        /* To check if number entered in t1 is even or odd
        String s = t1.getText();
        int n = Integer.parseInt(s);
        if (n%2 == 0) t2.setText("Even");
        else t2.setText("Odd"); */
        String s = t1.getText();
        
         //To change color of text entered in t1 after button is clicked
         t1.setForeground(Color.WHITE); // changes color of text
         t1.setBackground(Color.BLACK); // changes background color of text field
         f.getContentPane().setBackground(Color.PINK); // changes bg color of frame to pink
         t1.setText(s.toUpperCase()); // changes text to uppercase
         Font f = new Font ("Arial",  Font.ITALIC, 20);
         t1.setFont(f); // changes font of text field t1
         
    }
}
