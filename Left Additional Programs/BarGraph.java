// total = 100, data = 20, 35, 30, 15
import javax.swing.* ;
import java.awt.*;

public class BarGraph extends JFrame{
    int [] data = {20, 35, 30, 15};
    int frameWidth = 600 ;
    int frameHeight = 600 ;
    int barWidth = 50 ;
    public BarGraph(){
        setSize(frameWidth, frameHeight);
        setLayout(null);
        setVisible(true);
    }
    public int getMax(){
        int max = 0;
        for (int i: data) {
            if (i > max) max = i;
        }
        return max ;
    }
    public int [] getHeights() {
        int heights[] = new int [data.length];
        for (int i=0; i<data.length; i++) {
            heights[i] = Math.round(frameHeight /getMax()* data[i]);
        }
        return heights;
    }
    public void paint(Graphics g) {
        int [] heights = getHeights();
        Color [] c = {Color.RED, Color.GREEN, Color.BLUE, Color.PINK};
        for (int i=0; i<data.length; i++) {
            g.setColor(c[i]);
            g.fillRect(i*barWidth,frameHeight-heights[i],barWidth,heights[i]);
        }
    }
    public static void main (String [] args) {
        new BarGraph();
    }
}
