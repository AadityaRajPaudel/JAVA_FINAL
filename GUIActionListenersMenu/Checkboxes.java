import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Checkboxes implements ItemListener{
    JFrame f;
    JCheckBox c1,c2;
    JTextField t;
    public Checkboxes(){
        f=new JFrame();
        f.setSize(600,600);
        t= new JTextField();
        t.setBounds(100,300,150,50);
        c1=new JCheckBox("JAVA");
        c2=new JCheckBox("Math");
        c1.setBounds(100,100,150,50);
        c2.setBounds(100,200,150,50);

        f.setLayout(null);
        f.add(c1);
        f.add(c2);
        f.add(t);
        f.setVisible(true);

        c1.addItemListener(this);
        c2.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e){
        if (e.getSource()==c1){
            if(e.getStateChange()==1) t.setText("Java selected");
            else t.setText("Java de-selected");
        }
        else {
            
            if(e.getStateChange()==1) t.setText("Math selected");
            else t.setText("Math de-selected");
        
        }
    }
    public static void main(String[] args) {
        new Checkboxes();
    }
}
