// Java Program to Launch the browser
// and open a specific URI
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;

    class desk extends JFrame implements ActionListener {

        // frame
        static JFrame f;

        // Main Method
        public static void main(String args[])
        {
            desk d = new desk();

            // create a frame
            f = new JFrame("desktop");

            // create a panel
            JPanel p = new JPanel();

            // create a button
            JButton b = new JButton("launch");

            // add Action Listener
            b.addActionListener(d);

            p.add(b);
            f.add(p);
            f.show();
            f.setSize(300, 300);
        }

        // if button is pressed
        public void actionPerformed(ActionEvent e)
        {
            try {

                // create a URI
                URI u = new URI("www.youtube.com");

                Desktop d = Desktop.getDesktop();
                d.browse(u);
            }
            catch (Exception evt) {
            }
        }
    }
