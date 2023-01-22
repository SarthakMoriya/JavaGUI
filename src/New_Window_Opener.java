import javax.swing.*;
import java.awt.*;

public class New_Window_Opener {
    JPanel p1 = new JPanel();
    JFrame frame = new JFrame("New Window");

    New_Window_Opener() {
        p1.setBounds(100, 100, 200, 200);
        p1.setBackground(Color.DARK_GRAY);

        frame.add(p1);
        //yyo
        //yooyoo
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}
