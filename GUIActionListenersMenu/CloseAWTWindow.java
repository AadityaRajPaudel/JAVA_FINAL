//Closing AWT window in JAVA, all methods 
import java.awt.* ;
import java.awt.event.*;

public class CloseAWTWindow implements WindowListener{
    Frame f;
    public CloseAWTWindow() {
        f = new Frame("Closing AWT Window");
        f.setSize(600, 600);

        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(this);
    }
    public static void main(String [] args) {
        new CloseAWTWindow();
    }
    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        //f.setVisible(false); any of these 3 lines we can use
        //System.exit(0);
        //f.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
       
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
       
    }
    
}
