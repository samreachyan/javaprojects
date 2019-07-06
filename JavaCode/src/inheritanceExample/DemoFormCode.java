package inheritanceExample;
import javax.swing.JOptionPane;

public class DemoFormCode {
    public static void main(String[] args){
        // show form to user to input
        String fname = JOptionPane.showInputDialog("What is your first name?");
        String lname = JOptionPane.showInputDialog("What is your last name?");
        //Create message after input
        String message = String.format("Welcome %s %s, this is Java programming!!", fname, lname);
        
        JOptionPane.showMessageDialog(null, message);
        
    }
}
