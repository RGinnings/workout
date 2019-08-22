
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CustomPane extends JOptionPane {

    static int input;
    static int in;

    static void showOptionDialog(final JEditorPane ep, final ImageIcon icon) throws IOException {
        JLabel message = new JLabel("You will not be able to view this move set after closing this window."+
                "\n"+"Go back?",JLabel.CENTER);
        input = JOptionPane.showConfirmDialog(null, ep, "Your Daily Workout", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, icon);
        if (input == JOptionPane.OK_OPTION) {
            in = JOptionPane.showConfirmDialog(null,message , "Your Daily Workout", JOptionPane.YES_NO_OPTION);
            if (in == JOptionPane.OK_OPTION) {
                CustomPane.showOptionDialog(ep, icon);
            } else {
                System.exit(0);
            }
        }
    }
}
