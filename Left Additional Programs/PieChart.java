// As per poll conducted in class of 48 students, 25 support virtual classes, 15 are against it. Remaining 8 are neutral. Create pie chart to demonstrate it. We have to extend JFrame
import javax.swing.* ;
import java.awt.* ;

public class PieChart extends JFrame{
    
    int data [] = {25, 15, 8};
    public PieChart() {
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    int getTotal() {
        int total=0;
        for(int i:data){
            total=total+ i;
        }
        return total;
    }
    int [] getAngles() {
        int angles[] = new int[data.length];
        for (int i=0;  i<data.length; i++) {
            angles[i] = Math.round(data[i] * 360/getTotal());
        }
        return angles;
    }
    public void paint(Graphics g) {
        int [] angles = getAngles();
        Color [] c = {Color.RED, Color.GREEN, Color.BLUE};
        int startAngle = 0;
        for (int i = 0; i<data.length; i++) {
            g.setColor(c[i]);
            g.fillArc(100, 150, 150, 150, startAngle, angles[i]);
            startAngle = startAngle + angles[i];
        }
    }
    public static void main(String [] args){
        new PieChart();
    }

}
