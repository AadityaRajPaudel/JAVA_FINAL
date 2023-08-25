import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ViewTwo {
    View v ;
    public ViewTwo(View v){
        this.v=v;
    }
    public void actionPerformed(ActionEvent e){
        Font f = new Font("Arial", Font.BOLD, 20);
        this.v.t.setFont(f);
        this.v.t.setForeground(Color.RED);
    }
}
