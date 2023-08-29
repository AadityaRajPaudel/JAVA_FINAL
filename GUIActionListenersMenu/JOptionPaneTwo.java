// Swing GUI that asks to confirm if we close the window
import javax.swing.*;
import java.awt.event.*;

public class JOptionPaneTwo implements WindowListener{
    JFrame f ;
    public JOptionPaneTwo(){
        f = new JFrame();
        f.setSize(600, 600);

        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.addWindowListener(this);
    }
    public static void main(String [] args) {
        new JOptionPaneTwo();
    }
    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        int n = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
        if (n == 0) System.exit(0);
        
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
