import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main() {
        MyFrame myFrame = new MyFrame(); // created an instance of myframe class
        JLabel label = new JLabel();
        label.setText("Hello world");
        myFrame.add(label);

    }
}





//        frame.setSize(420,420); // sets x dimension and y dimension
//        frame.setTitle("One Application");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//        frame.setResizable(false);// prevent frame being resize
//        change the logo
//        ImageIcon image = new ImageIcon("file path");
//        frame.setIconImage(image.getImage());
//
//        frame.setVisible(true);// make frame visible
//
//        frame.getContentPane().setBackground(Color.BLACK); // background colour