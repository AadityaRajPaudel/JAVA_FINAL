// FLAG OF NEPAL
import java.awt.*;
import javax.swing.*;

public class NepalKoJhanda extends JFrame{
    
    public NepalKoJhanda(){
        setSize(600, 600);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g) {
        
        //upper triangle
        int [] x = {100, 150, 100};
        int [] y = {50, 150, 150};
        g.setColor(Color.BLUE);
        g.fillPolygon(x, y, 3);

        //Lower Triangle
        int [] x2 = {100, 150, 100};
        int [] y2 = {150, 250, 250};
        g.setColor(Color.BLUE);
        g.fillPolygon(x2, y2, 3);

        //Stick
        g.setColor(Color.BLACK);
        g.drawLine(100, 250, 100, 350);
    }
    public static void main(String [] args) {
        new NepalKoJhanda();
    }
}
