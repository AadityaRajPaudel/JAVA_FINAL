// JOptionPane all in one, Reminder: JOptionPane is a swing component
import javax.swing.* ;

public class JOptionPaneOne {
    public static void main (String []args) {
        JOptionPane.showMessageDialog(null, "Message", "Title", JOptionPane.PLAIN_MESSAGE);
        String s = JOptionPane.showInputDialog(null, "Input message"); // whatever we input will be stored in s
        System.out.println(s);
        System.out.println(JOptionPane.showConfirmDialog(null, "Message", "Title", JOptionPane.YES_NO_CANCEL_OPTION)); // returns 0 if yes is selected, 1-> No, 2-> cancel
    }    
}
