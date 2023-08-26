import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymusClass{
    JFrame f;
    JButton b;
    JTextField t;
    public AnonymusClass(){
        f = new JFrame();
        f.setSize(600,600);
        b=new JButton("Click");
        b.setBounds(100,100,150,50);
        t=new JTextField();
        t.setBounds(100,200,150,50);

        f.setLayout(null);
        f.add(b);
        f.add(t);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText("Clicked");
            }
        });
            
    }
    public static void main(String[] args) {
        new AnonymusClass();   
    }
    
    
}
