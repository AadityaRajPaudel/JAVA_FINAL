// change font of text field after button is clicked, dedicate event handling to separate class
import java.awt.*;
import java.awt.event.*;
import java.beans.EventHandler;

import javax.swing.*;

public class View implements ActionListener{
    JFrame f ;
    JTextField t;
    JButton b;
    public View(){
        f = new JFrame();
        f.setSize(600,600);
        t=new JTextField();
        t.setBounds(100, 100, 100, 50);
        b=new JButton("Click");
        b.setBounds(100,200,100,50);
        f.setLayout(null);
        f.add(t);
        f.add(b);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        EventHandler ev = new EventHandler(this);
        b.addActionListener(ev); //these two lines are shown as error but must be written
    }
    public static void main(String[] args) {
        new View();
    }
}
