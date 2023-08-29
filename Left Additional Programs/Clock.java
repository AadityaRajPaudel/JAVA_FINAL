import java.awt.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Clock {
    JFrame f ;
    JLabel t ;
    SimpleDateFormat format;
    public Clock() throws Exception{
        f=new JFrame("Clock");
        f.setSize(500,200);
        t=new JLabel();
        t.setBounds(50,50, 400,100);
        f.setLayout(null);
        f.add(t);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        format = new SimpleDateFormat("HH:mm:ss");
        time();
    }
    public void time() throws Exception{
        String timee;
        while (true) {
            timee = format.format(Calendar.getInstance().getTime());
            t.setText(timee);
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args) throws Exception{
        new Clock();
    }
}