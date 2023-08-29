import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Radios implements ActionListener{
    JFrame f;
    JRadioButton b1,b2;
    JTextField t;
    public Radios(){
        f=new JFrame();
        f.setSize(600,600);
        t= new JTextField();
        t.setBounds(100,300,150,50);
        b1=new JRadioButton("JAVA");
        b2=new JRadioButton("Math");
        b1.setBounds(100,100,150,50);
        b2.setBounds(100,200,150,50);
        f.setLayout(null);
        f.add(b1);
        f.add(t);
        t.setEditable(false);
        f.add(b2);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            if(b1.isSelected()) t.setText("JAVA selected");
            else t.setText("JAVA de-selected");
        }
        else {
            if(b2.isSelected()) t.setText("Math is selected");
            else t.setText("Math de-selected");
        }
    }
    public static void main(String[] args) {
        new Radios();
    }
}
