import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setSize(420,420); // sets x dimension and y dimension
        this.setTitle("One Application");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false);// prevent frame being resize
        // change the logo
        // ImageIcon image = new ImageIcon("file path");
        // this.setIconImage(image.getImage());

        this.setVisible(true);// make frame visible

        this.getContentPane().setBackground(Color.WHITE); // background colour
    }
}
