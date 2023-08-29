import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class EventHandler implements ActionListener {
    View v;
    public EventHandler(View v){
        this.v=v;
    
    }
    public void actionPerformed(ActionEvent e ){
        this.v.t.setText(this.v.t.toUpperCase());
    }
    
}

