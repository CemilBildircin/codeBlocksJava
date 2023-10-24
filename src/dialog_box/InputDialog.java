package dialog_box;
import javax.swing.JOptionPane;    // Needed for Dialog Box

public class InputDialog {
    public static void main(String[] args) {

        String name;

        // Get the user's name.
        name = JOptionPane.showInputDialog("What is your name? ");

        // Display message
        JOptionPane.showMessageDialog(null, "Hello " + name);

    }
}
