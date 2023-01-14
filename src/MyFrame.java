import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("XYZ PROJECT");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.getContentPane().setBackground(new Color(0, 0, 255));
        this.setVisible(true);

        ImageIcon img=new ImageIcon("E:\\Web\\Java\\JavaGUI\\JavaGUI\\logo.png");
        this.setIconImage(img.getImage());
    }
}
